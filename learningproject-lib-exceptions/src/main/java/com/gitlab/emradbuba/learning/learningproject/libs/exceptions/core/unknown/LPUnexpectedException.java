package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.unknown;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectRestException;

public class LPUnexpectedException extends LearningProjectRestException {
    public LPUnexpectedException(String message) {
        super(message);
    }

    public LPUnexpectedException(String message, Throwable cause) {
        super(message, cause);
    }
}
