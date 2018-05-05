package vens.ai.graduate.design.notifaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author vens
 * @date 2018-05-04 14:49
 **/
@Configuration
@ComponentScan
@EnableAutoConfiguration
@MapperScan(basePackages = "vens.ai.graduate.design.notifaction.dao")
public class NotifactionApplication {
    public static void main(String[]args){
        SpringApplication.run(NotifactionApplication.class,args);
    }
}
