package io.quantixx.sponsor.client.activiti;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

public class TokenRelayRequestInterceptor implements RequestInterceptor {

    public static final String AUTHORIZATION = "Authorization";

    @Override
    public void apply(RequestTemplate template) {
        OAuth2AuthenticationDetails details = getDetails();
        String headerValue = String.format("%s %s", details.getTokenType(), details.getTokenValue());
        template.header(AUTHORIZATION, headerValue);
    }

    protected OAuth2AuthenticationDetails getDetails() {
        return (OAuth2AuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
    }
}
