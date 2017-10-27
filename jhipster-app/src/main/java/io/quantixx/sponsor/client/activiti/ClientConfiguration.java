package io.quantixx.sponsor.client.activiti;

import feign.Logger;
import io.quantixx.sponsor.client.ExcludeFromComponentScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeFromComponentScan
@EnableConfigurationProperties
public class ClientConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    // @Bean
    // public RequestInterceptor requestTokenBearerInterceptor() {
    //
    //     return new RequestInterceptor() {
    //         @Override
    //         public void apply(RequestTemplate requestTemplate) {
    //             Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    //             OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) authentication.getDetails();
    //             requestTemplate.header("Authorization", "Bearer " + details.getTokenValue());
    //         }
    //     };
    // }

}
