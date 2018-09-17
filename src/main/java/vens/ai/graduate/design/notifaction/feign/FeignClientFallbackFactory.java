package vens.ai.graduate.design.notifaction.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import vens.ai.graduate.design.notifaction.entity.MessageTemplate;
import vens.ai.graduate.design.notifaction.entity.User;

import java.util.List;
@Component
public class FeignClientFallbackFactory implements FallbackFactory<NumberFeignClient> {
    @Override
    public NumberFeignClient create(Throwable throwable) {

        return new NumberFeignClient() {
            @Override
            public MessageTemplate findTemplateByName(String name) {
                if(null==throwable){
                    return null;
                }
                MessageTemplate messageTemplate = new MessageTemplate();
                messageTemplate.setTemplate("default_template");
                messageTemplate.setTemplateId("1");
                messageTemplate.setTemplateName("default");
                return messageTemplate;
            }

            @Override
            public List<User> findAllUser() {
                return null;
            }

            @Override
            public List<User> findUserByPosition(String target) {
                return null;
            }

            @Override
            public List<User> findByDepartment(String target) {
                return null;
            }
        };
    }
}
