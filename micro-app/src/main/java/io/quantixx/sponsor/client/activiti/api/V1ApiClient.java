package io.quantixx.sponsor.client.activiti.api;


import io.quantixx.sponsor.client.AuthorizedFeignClient;

@AuthorizedFeignClient(name = "ACTIVITI-RUNTIME-BUNDLE")
public interface V1ApiClient extends V1Api {
}
