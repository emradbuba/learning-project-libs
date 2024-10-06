package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.business;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectException;

/**
 * Exception to use in case of any logic which violates the agreed business rules.
 */
public class LearningProjectBusinessRulesViolationException extends LearningProjectException {

    public LearningProjectBusinessRulesViolationException(String message) {
        super(message);
    }

    public LearningProjectBusinessRulesViolationException(String message, Throwable cause) {
        super(message, cause);
    }
}
