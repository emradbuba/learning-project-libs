package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.utils;

import java.util.Optional;

public class ExceptionLibVersion {

    private ExceptionLibVersion() {
    }

    public static String getCurrentVersion() {
        Package thePackage = ExceptionLibVersion.class.getPackage();
        return Optional.ofNullable(thePackage.getImplementationVersion())
                .orElse(thePackage.getSpecificationVersion());
    }
}
