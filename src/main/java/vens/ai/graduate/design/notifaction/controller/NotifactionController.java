package vens.ai.graduate.design.notifaction.controller;

import vens.ai.graduate.design.notifaction.request.NotiRequest;
import vens.ai.graduate.design.notifaction.response.NotiResponse;

import javax.mail.MessagingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.UnsupportedEncodingException;

/**
 * @author
 * @date 2018-05-04 14:49
 **/
@Path("/endpoint")
public interface NotifactionController {
    @POST
    @Path("/sendEmails")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    NotiResponse sendMessages(NotiRequest request) throws UnsupportedEncodingException, MessagingException;
}
