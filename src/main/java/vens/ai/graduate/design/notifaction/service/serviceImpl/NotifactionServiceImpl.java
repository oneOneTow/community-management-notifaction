package vens.ai.graduate.design.notifaction.service.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vens.ai.graduate.design.notifaction.feign.NumberFeignClient;
import vens.ai.graduate.design.notifaction.mapper.MessageTemplateMapper;
import vens.ai.graduate.design.notifaction.mapper.UserMapper;
import vens.ai.graduate.design.notifaction.entity.MessageTemplate;
import vens.ai.graduate.design.notifaction.entity.User;
import vens.ai.graduate.design.notifaction.request.NotiRequest;
import vens.ai.graduate.design.notifaction.response.FaildUser;
import vens.ai.graduate.design.notifaction.response.NotiResponse;
import vens.ai.graduate.design.notifaction.service.MailService;
import vens.ai.graduate.design.notifaction.service.NotifactionService;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author vens
 * @date 2018-05-12 16:54
 **/
@Service
public class NotifactionServiceImpl implements NotifactionService {
    @Autowired
    NumberFeignClient numberFeignClient;

    @Override
    public NotiResponse sendMessages(NotiRequest request) throws UnsupportedEncodingException, MessagingException {
        NotiResponse response = new NotiResponse();
        List<FaildUser> faildUsers = null;
        String message = request.getMessage();
        String subject = "通知";
        List<User> users = getUsers(request.getTarget());
        String templateName = request.getMessageType();
        MessageTemplate messageTemplate = numberFeignClient.findTemplateByName(templateName);
        for (User user : users) {
            sendMessage(user.getStudentName(), message, messageTemplate.getTemplate(), user.getEmail(), subject);
        }
        return response;
    }

    private void sendMessage(String stuName, String message, String template, String adress, String subject) throws UnsupportedEncodingException, MessagingException {
        String finalMessage = makeMessage(stuName, message, template);
        MailService.sendHtmlMail(adress, subject, finalMessage);
    }

    private String makeMessage(String stuName, String message, String template) {
        String finalMessage = template.replaceAll("\\+\\+", stuName);
        finalMessage = finalMessage.replaceAll("\\*\\*", message);
        return finalMessage;
    }

    private List<User> getUsers(String target) {
        List<User> users = null;
        switch (target) {
            case "all":
                users = numberFeignClient.findAllUser();
                break;
            case "Minister":
                users = numberFeignClient.findUserByPosition(target);
                break;
            default:
                users = numberFeignClient.findByDepartment(target);
                break;
        }
        return users;
    }

}
