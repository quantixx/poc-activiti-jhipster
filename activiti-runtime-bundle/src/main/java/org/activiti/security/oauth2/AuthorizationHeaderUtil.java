package org.activiti.security.oauth2;

import org.keycloak.adapters.springsecurity.account.SimpleKeycloakAccount;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthorizationHeaderUtil {

    public static String getAuthorizationHeader() {

        SimpleKeycloakAccount details =
            (SimpleKeycloakAccount) SecurityContextHolder.getContext().getAuthentication().getDetails();

        return String.format("%s %s", details.getKeycloakSecurityContext().getToken().getType(), details.getKeycloakSecurityContext().getToken().getAccessTokenHash());

        // OAuth2AuthenticationDetails details =
        //     (OAuth2AuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();

        // return String.format("%s %s", details.getTokenType(), details.getTokenValue());
    }
}
