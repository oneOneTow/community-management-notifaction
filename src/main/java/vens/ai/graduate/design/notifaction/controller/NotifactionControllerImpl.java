package vens.ai.graduate.design.notifaction.controller;

import org.springframework.stereotype.Component;
import vens.ai.graduate.design.notifaction.request.NotiRequest;
import vens.ai.graduate.design.notifaction.response.NotiResponse;

/**
 * @author vens
 * @date 2018-05-04 14:52
 **/
@Component("notiController")
public class NotifactionControllerImpl implements NotifactionController {

    public NotiResponse getResponse(NotiRequest request) {
        System.out.println(request);
        NotiResponse response=new NotiResponse();
        response.setName("ok");
        response.setAge("isok");
        return response;
    }
}
