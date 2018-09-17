package vens.ai.graduate.design.notifaction.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vens.ai.graduate.design.notifaction.entity.MessageTemplate;
import vens.ai.graduate.design.notifaction.entity.User;

import java.util.List;

@FeignClient(
        name = "number",
        fallbackFactory = FeignClientFallbackFactory.class
)
public interface NumberFeignClient {
    /**
     * 获取messageTemplate根据name
     * @param name
     * @return
     */
    @RequestMapping(
            value = "/{name}",
            method = RequestMethod.GET
    )
    MessageTemplate findTemplateByName(@PathVariable("name") String name);
    @RequestMapping(
            value = "",
            method = RequestMethod.GET
    )
    List<User> findAllUser();
    @RequestMapping(
            value = "/{target}",
            method = RequestMethod.GET
    )
    List<User> findUserByPosition(@PathVariable String target);
    @RequestMapping(
            value = "/{target}",
            method = RequestMethod.GET
    )
    List<User> findByDepartment(@PathVariable String target);
}
