package io.quantixx.sponsor.client.activiti.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import io.quantixx.sponsor.client.activiti.ClientConfiguration;

@FeignClient(name="${activiti.name:activiti}", url="${activiti.url:https://localhost:8081}", configuration = ClientConfiguration.class)
public interface V1ApiClient extends V1Api {
}