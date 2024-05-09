package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * The top most exception which can be thrown from all services being a part of the LearningProject
 */
@Getter
public class LearningProjectException extends RuntimeException {

    private LearningProjectExceptionReason reason;
    private String extraInformation;

    public LearningProjectException(String message) {
        super(message);
    }

    public LearningProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public LearningProjectException withExtraInformation(String extraInformation) {
        if (StringUtils.isNoneBlank()) {
            this.extraInformation = StringUtils.trim(extraInformation);
        }
        return this;
    }

    public LearningProjectException withReason(LearningProjectExceptionReason reason) {
        if (reason != null) {
            this.reason = reason;
        }
        return this;
    }
}
