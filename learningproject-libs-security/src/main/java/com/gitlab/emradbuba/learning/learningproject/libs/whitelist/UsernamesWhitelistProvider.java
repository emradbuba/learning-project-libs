package com.gitlab.emradbuba.learning.learningproject.libs.whitelist;

/**
 * Provides a source for checking whitelisted BasicAuth usernames which should be accepted
 * by security layer out of the box.
 */
public interface UsernamesWhitelistProvider {

    boolean isWhitelisted(String username);

    String DEFAULT_WHITELIST_ROLENAME = "WHITELIST";
}
