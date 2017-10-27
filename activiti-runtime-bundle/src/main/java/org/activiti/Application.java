package org.activiti;


import org.activiti.cloud.starter.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @ComponentScan(excludeFilters = {
//         @ComponentScan.Filter(ExcludeFromComponentScan.class)
// })
// @EnableFeignClients
@SpringBootApplication
@ActivitiRuntimeBundle
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}