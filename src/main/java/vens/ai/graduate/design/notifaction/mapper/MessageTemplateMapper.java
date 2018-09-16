package vens.ai.graduate.design.notifaction.mapper;

import vens.ai.graduate.design.notifaction.entity.MessageTemplate;

/**
 * @author
 * @date 2018-05-12 17:27
 **/
public interface MessageTemplateMapper {
    MessageTemplate findByName(String templateName);
    int add(MessageTemplate messageTemplate);
}
