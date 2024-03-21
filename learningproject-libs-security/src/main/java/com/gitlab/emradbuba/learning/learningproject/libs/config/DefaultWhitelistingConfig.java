package com.gitlab.emradbuba.learning.learningproject.libs.config;

import com.gitlab.emradbuba.learning.learningproject.libs.whitelist.DefaultUsernamesWhitelistProvider;
import com.gitlab.emradbuba.learning.learningproject.libs.whitelist.UsernamesWhitelistProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@Slf4j
public class DefaultWhitelistingConfig {

    @Bean
    @ConditionalOnMissingBean(UsernamesWhitelistProvider.class) // <-- only when consumers do not define their own WL providers
    public UsernamesWhitelistProvider defaultUsernamesWhitelistProvider() {
        log.info("No whitelisting configured - adding default configuration...");
        return new DefaultUsernamesWhitelistProvider();
    }
}
