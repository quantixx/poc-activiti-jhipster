package io.quantixx.sponsor.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "io.quantixx.sponsor")
public class FeignConfiguration {

}
