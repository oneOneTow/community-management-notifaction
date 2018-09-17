package vens.ai.graduate.design.notifaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author vens
 * @date 2018-05-04 14:49
 **/
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@SpringBootApplication
@MapperScan(basePackages = "vens.ai.graduate.design.notifaction.mapper")
public class NotifactionApplication {
    public static void main(String[]args){
        SpringApplication.run(NotifactionApplication.class,args);
    }
}
