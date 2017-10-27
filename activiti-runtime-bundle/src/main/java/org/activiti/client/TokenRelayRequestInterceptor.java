package org.activiti.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.activiti.security.oauth2.AuthorizationHeaderUtil;

public class TokenRelayRequestInterceptor implements RequestInterceptor {

    public static final String AUTHORIZATION = "Authorization";

    public void apply(RequestTemplate template) {
        template.header(AUTHORIZATION, AuthorizationHeaderUtil.getAuthorizationHeader());
    }
}
