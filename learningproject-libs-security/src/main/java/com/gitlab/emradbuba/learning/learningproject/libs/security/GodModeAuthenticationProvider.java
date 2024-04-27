package com.gitlab.emradbuba.learning.learningproject.libs.security;

import com.gitlab.emradbuba.learning.learningproject.libs.whitelist.GodModeLoginsProvider;
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
public class GodModeAuthenticationProvider implements AuthenticationProvider {

    private final List<GodModeLoginsProvider> godModeLoginsProviders;

    public GodModeAuthenticationProvider(List<GodModeLoginsProvider> godModeLoginsProviders) {
        this.godModeLoginsProviders = godModeLoginsProviders; // <-- gather user defined implementations (or a default one)
        log.info("Configured {} GodMode logins providers: <{}>", godModeLoginsProviders.size(),
                listGodModeLoginsProvidersNames(godModeLoginsProviders));
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String usernameFromAuthToken = Optional.ofNullable(authentication)
                .map(Authentication::getName)
                .map(String::trim)
                .map(String::toLowerCase)
                .filter(not(String::isEmpty))
                .orElse(null);

        if (!StringUtils.hasText(usernameFromAuthToken)) {
            return null;
        }

        if (isFoundInGodModeLoginsProviders(usernameFromAuthToken)) {
            // Forward token with same credentials, but add GodMode role, so clients can use it in security config
            return new UsernamePasswordAuthenticationToken(
                    authentication.getPrincipal(),
                    authentication.getCredentials(),
                    List.of(new SimpleGrantedAuthority("ROLE_" + GodModeLoginsProvider.GOD_MODE_ROLENAME))
            );
        }
        return null;
    }

    private static List<String> listGodModeLoginsProvidersNames(List<GodModeLoginsProvider> whitelistProviders) {
        return whitelistProviders
                .stream()
                .map(wp -> wp.getClass().getName())
                .toList();
    }

    private boolean isFoundInGodModeLoginsProviders(String usernameFromToken) {
        return godModeLoginsProviders.stream()
                .anyMatch(provider -> provider.isGodModeLogin(usernameFromToken));
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
