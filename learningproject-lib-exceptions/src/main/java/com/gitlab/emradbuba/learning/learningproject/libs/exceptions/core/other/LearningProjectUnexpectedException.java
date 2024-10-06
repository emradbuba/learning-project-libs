package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.other;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectException;

/**
 * Exception to use in all other, unpredicted causes of failure.
 */
public class LearningProjectUnexpectedException extends LearningProjectException {

    public LearningProjectUnexpectedException(String message) {
        super(message);
    }

    public LearningProjectUnexpectedException(String message, Throwable cause) {
        super(message, cause);
    }
}
