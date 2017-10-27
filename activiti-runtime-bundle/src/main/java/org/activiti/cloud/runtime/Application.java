package org.activiti.cloud.runtime;


import org.activiti.cloud.starter.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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