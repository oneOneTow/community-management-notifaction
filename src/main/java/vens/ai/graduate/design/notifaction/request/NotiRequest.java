package vens.ai.graduate.design.notifaction.request;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author vens
 * @date 2018-05-04 14:51
 **/
@XmlRootElement(name = "NotiRequest")
public class NotiRequest {
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
        return "NotiRequest{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
