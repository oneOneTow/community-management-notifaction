package vens.ai.graduate.design.notifaction.service;

import vens.ai.graduate.design.notifaction.request.NotiRequest;
import vens.ai.graduate.design.notifaction.response.NotiResponse;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

/**
 * @author
 * @date 2018-05-12 16:53
 **/
public interface NotifactionService {
    /**
     * 推送信息
     * @param request
     * @return
     */
    NotiResponse sendMessages(NotiRequest request) throws UnsupportedEncodingException, MessagingException;
}
