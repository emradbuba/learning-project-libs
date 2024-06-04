package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.notfound;

public class LPIdCardNotFoundException extends LPPersonNotFoundException {

    public LPIdCardNotFoundException(String message) {
        super(message);
    }

    public LPIdCardNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
