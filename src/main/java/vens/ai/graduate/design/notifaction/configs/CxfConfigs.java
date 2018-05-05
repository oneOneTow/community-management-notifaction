package vens.ai.graduate.design.notifaction.configs;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vens.ai.graduate.design.notifaction.controller.NotifactionControllerImpl;

import java.util.Arrays;

/**
 * @author vens
 * @date 2018-05-04 15:14
 **/
@Configuration
public class CxfConfigs {
    @Autowired
    private Bus bus;
    @Bean
    public Server rsServer(){
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setServiceBeans(Arrays.<Object>asList(new NotifactionControllerImpl()));
        endpoint.setAddress("/");
        endpoint.setProvider(new JacksonJsonProvider());
        endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
        return endpoint.create();
    }
    @Bean
    public JacksonJsonProvider jsonProvider(){
        return new JacksonJsonProvider();
    }
}
