package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.bad;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectException;

public class LPBusinessRulesViolationException extends LearningProjectException {
    public LPBusinessRulesViolationException(String message) {
        super(message);
    }

    public LPBusinessRulesViolationException(String message, Throwable cause) {
        super(message, cause);
    }
}
