package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.unprocessable;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectException;

/**
 * Exception to use in case of corrupted input data, like incorrect content (for structural or formal perspective) of a REST request/payload.
 */
public class LearningProjectIncorrectInputException extends LearningProjectException {

    public LearningProjectIncorrectInputException(String message) {
        super(message);
    }

    public LearningProjectIncorrectInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
