package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.external;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectException;

/**
 * Exception to use in case of problems caused by external systems, like unexpected errors from calls to external API.
 */
public class LearningProjectExternalCauseException extends LearningProjectException  {
    public LearningProjectExternalCauseException(String message) {
        super(message);
    }

    public LearningProjectExternalCauseException(String message, Throwable cause) {
        super(message, cause);
    }
}
