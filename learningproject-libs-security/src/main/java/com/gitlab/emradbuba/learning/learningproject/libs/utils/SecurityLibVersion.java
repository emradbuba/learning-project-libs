package com.gitlab.emradbuba.learning.learningproject.libs.utils;

import java.util.Optional;

public class SecurityLibVersion {

    public static String getCurrentVersion() {
        Package thePackage = SecurityLibVersion.class.getPackage();
        return Optional.ofNullable(thePackage.getImplementationVersion())
                .orElse(thePackage.getSpecificationVersion());
    }
}
