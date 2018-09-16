package vens.ai.graduate.design.notifaction.entity;

/**
 * @author vens
 * @date 2018-05-12 17:17
 **/
public class MessageTemplate {
    String templateId;
    String templateName;
    String template;


    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
