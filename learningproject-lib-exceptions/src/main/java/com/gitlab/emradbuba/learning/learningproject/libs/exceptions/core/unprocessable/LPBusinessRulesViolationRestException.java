package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.unprocessable;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectRestException;

public class LPBusinessRulesViolationRestException extends LearningProjectRestException {
    public LPBusinessRulesViolationRestException(String message) {
        super(message);
    }

    public LPBusinessRulesViolationRestException(String message, Throwable cause) {
        super(message, cause);
    }
}
