package com.gitlab.emradbuba.learning.learningproject.libs.whitelist;

/**
 * Defines an interface saying if a given username/login should be treated as a GodMode user.
 */
public interface GodModeLoginsProvider {

    boolean isGodModeLogin(String username);

    String GOD_MODE_ROLENAME = "GOD_MODE";
}
