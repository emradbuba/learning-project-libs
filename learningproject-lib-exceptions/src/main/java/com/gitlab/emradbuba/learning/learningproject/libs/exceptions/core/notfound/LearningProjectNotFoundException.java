package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.notfound;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectException;

/**
 * Exception to use in case of non found resources meant to be found.
 * For example in case a REST call for a resource asks for a non-existing entity...
 */
public class LearningProjectNotFoundException extends LearningProjectException {

    public LearningProjectNotFoundException(String message) {
        super(message);
    }

    public LearningProjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
