package com.gitlab.emradbuba.learning.learningproject.libs.security;

import com.gitlab.emradbuba.learning.learningproject.libs.whitelist.UsernamesWhitelistProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

import static java.util.function.Predicate.not;

@Component
@Slf4j
public class WhitelistingAuthenticationProvider implements AuthenticationProvider {

    private final List<UsernamesWhitelistProvider> whitelistProviders;

    public WhitelistingAuthenticationProvider(List<UsernamesWhitelistProvider> whitelistProviders) {
        this.whitelistProviders = whitelistProviders;
        log.info("Configured {} whitelist providers: <{}>", whitelistProviders.size(),
                listWhitelistProvidersNames(whitelistProviders));
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String usernameFromToken = Optional.ofNullable(authentication)
                .map(Authentication::getName)
                .map(String::trim)
                .map(String::toLowerCase)
                .filter(not(String::isEmpty))
                .orElse(null);

        if (!StringUtils.hasText(usernameFromToken)) {
            return null;
        }

        if (isFoundInWhitelistProviders(usernameFromToken)) {
            return new UsernamePasswordAuthenticationToken(
                    authentication.getPrincipal(),
                    authentication.getCredentials(),
                    List.of(new SimpleGrantedAuthority("ROLE_" + UsernamesWhitelistProvider.DEFAULT_WHITELIST_ROLENAME))
            );
        }
        return null;
    }

    private static List<String> listWhitelistProvidersNames(List<UsernamesWhitelistProvider> whitelistProviders) {
        return whitelistProviders
                .stream()
                .map(wp -> wp.getClass().getName())
                .toList();
    }

    private boolean isFoundInWhitelistProviders(String usernameFromToken) {
        return whitelistProviders.stream()
                .anyMatch(wp -> wp.isWhitelisted(usernameFromToken));
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
