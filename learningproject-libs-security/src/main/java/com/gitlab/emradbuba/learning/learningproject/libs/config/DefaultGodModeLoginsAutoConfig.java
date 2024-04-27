package com.gitlab.emradbuba.learning.learningproject.libs.config;

import com.gitlab.emradbuba.learning.learningproject.libs.whitelist.DefaultGodModeLoginsProvider;
import com.gitlab.emradbuba.learning.learningproject.libs.whitelist.GodModeLoginsProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@Slf4j
public class DefaultGodModeLoginsAutoConfig {

    @Bean
    @ConditionalOnMissingBean(GodModeLoginsProvider.class) // <-- only when consumers do not define their own 'godmode' users
    public GodModeLoginsProvider defaultGodModeLoginProvider() {
        log.info("No GodMode users configured - adding default auto-configuration...");
        return new DefaultGodModeLoginsProvider();
    }
}
