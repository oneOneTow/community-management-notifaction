package vens.ai.graduate.design.notifaction.request;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author vens
 * @date 2018-05-04 14:51
 **/
@XmlRootElement(name = "NotiRequest")
public class NotiRequest {
   List<String> stuId;
   String target;
   String message;
   String messageType;
   String subject;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public List<String> getStuId() {
        return stuId;
    }

    public void setStuId(List<String> stuId) {
        this.stuId = stuId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
