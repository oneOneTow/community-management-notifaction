package vens.ai.graduate.design.notifaction.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author vens
 * @date 2018-05-04 14:51
 **/
@XmlRootElement
public class NotiResponse {
    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NotiResponse{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
