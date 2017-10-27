package org.activiti;


import org.activiti.client.ExcludeFromComponentScan;
import org.activiti.cloud.starter.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(ExcludeFromComponentScan.class)
})
@EnableFeignClients
@SpringBootApplication
@ActivitiRuntimeBundle
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}