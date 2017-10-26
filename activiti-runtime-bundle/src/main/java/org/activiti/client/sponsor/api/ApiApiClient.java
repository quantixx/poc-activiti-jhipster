package org.activiti.client.sponsor.api;

import org.activiti.client.sponsor.ClientConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name="${sponsor.name:sponsor}", url="${sponsor.url:https://localhost:8080}", configuration = ClientConfiguration.class)
public interface ApiApiClient extends ApiApi {
}