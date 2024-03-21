package com.gitlab.emradbuba.learning.learningproject.libs.whitelist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultUsernamesWhitelistProvider implements UsernamesWhitelistProvider {

    private static final String WHITELIST_LOGIN_LC = "whitelist";

    @Override
    public boolean isWhitelisted(String username) {
        if (WHITELIST_LOGIN_LC.equalsIgnoreCase(username)) {
            log.info("Accepting {} as whitelisted user...", username);
            return true;
        }
        return false;
    }
}
