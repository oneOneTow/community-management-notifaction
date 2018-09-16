package vens.ai.graduate.design.notifaction.response;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author vens
 * @date 2018-05-04 14:51
 **/
@XmlRootElement
public class NotiResponse {
    List<FaildUser> faildSends;
    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<FaildUser> getFaildSends() {
        return faildSends;
    }

    public void setFaildSends(List<FaildUser> faildSends) {
        this.faildSends = faildSends;
    }
}
