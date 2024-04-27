package com.gitlab.emradbuba.learning.learningproject.libs.whitelist;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class DefaultGodModeLoginsProvider implements GodModeLoginsProvider {

    private static final List<String> GOD_MODE_LOGINS = Stream
            .of("godmode", "superuser", "god")
            .map(String::toLowerCase)
            .toList();

    @Override
    public boolean isGodModeLogin(String username) {
        if (GOD_MODE_LOGINS.contains(username)) {
            log.info("Accepting {} as 'GOD_MODE' login...", username);
            return true;
        }
        return false;
    }
}
