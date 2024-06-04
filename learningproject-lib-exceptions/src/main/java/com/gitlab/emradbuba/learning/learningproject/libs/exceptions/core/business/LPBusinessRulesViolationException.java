package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.business;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LPException;

public class LPBusinessRulesViolationException extends LPException {
    public LPBusinessRulesViolationException(String message) {
        super(message);
    }

    public LPBusinessRulesViolationException(String message, Throwable cause) {
        super(message, cause);
    }
}
