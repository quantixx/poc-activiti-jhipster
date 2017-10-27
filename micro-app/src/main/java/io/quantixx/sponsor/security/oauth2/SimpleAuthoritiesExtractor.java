package io.quantixx.sponsor.security.oauth2;

import io.quantixx.sponsor.security.AuthoritiesConstants;
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class SimpleAuthoritiesExtractor implements AuthoritiesExtractor {

    private final String oauth2AuthoritiesAttribute;

    public SimpleAuthoritiesExtractor(String oauth2AuthoritiesAttribute) {
        this.oauth2AuthoritiesAttribute = oauth2AuthoritiesAttribute;
    }

    @Override
    public List<GrantedAuthority> extractAuthorities(Map<String, Object> map) {
        return Optional.ofNullable((List<String>) map.get(oauth2AuthoritiesAttribute))
            .filter(it -> !it.isEmpty())
            .orElse(Collections.singletonList(AuthoritiesConstants.USER))
            .stream()
            .map(role -> new SimpleGrantedAuthority(role))
            .collect(toList());
    }
}
