package io.quantixx.sponsor.client.activiti.api;

import io.quantixx.sponsor.client.activiti.AuthorizedFeignClient;
import io.quantixx.sponsor.client.activiti.ClientConfiguration;

@AuthorizedFeignClient(name="${activiti.name:activiti}", url="${activiti.url:http://localhost:8081}", configuration = ClientConfiguration.class)
public interface V1ApiClient extends V1Api {
}
