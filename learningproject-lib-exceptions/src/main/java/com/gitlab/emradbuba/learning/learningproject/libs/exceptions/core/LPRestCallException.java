package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core;

public class LPRestCallException extends LearningProjectException {
    public LPRestCallException(String message) {
        super(message);
    }

    public LPRestCallException(String message, Throwable cause) {
        super(message, cause);
    }
}
