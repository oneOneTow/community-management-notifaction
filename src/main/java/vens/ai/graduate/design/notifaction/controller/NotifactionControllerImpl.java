package vens.ai.graduate.design.notifaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vens.ai.graduate.design.notifaction.constant.BaseConstant;
import vens.ai.graduate.design.notifaction.exception.BaseException;
import vens.ai.graduate.design.notifaction.request.NotiRequest;
import vens.ai.graduate.design.notifaction.response.NotiResponse;
import vens.ai.graduate.design.notifaction.service.serviceImpl.NotifactionServiceImpl;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

/**
 * @author vens
 * @date 2018-05-04 14:52
 **/
@Component("notiController")
public class NotifactionControllerImpl implements NotifactionController {
    @Autowired
    NotifactionServiceImpl notifactionService;
    @Override
    public NotiResponse sendMessages(NotiRequest request) throws UnsupportedEncodingException, MessagingException {
        NotiResponse response=null;
        response=notifactionService.sendMessages(request);
        response.setCode(BaseConstant.RESPONSE_OK);
        return response;
    }
}
