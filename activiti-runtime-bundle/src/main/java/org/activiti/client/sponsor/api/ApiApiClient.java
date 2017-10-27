package org.activiti.client.sponsor.api;


import org.activiti.client.AuthorizedFeignClient;

@AuthorizedFeignClient(name = "SPONSOR")
public interface ApiApiClient extends ApiApi {
}