package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * The top most exception which can be thrown from all services being a part of the LearningProject
 */
@Getter
public class LearningProjectRestException extends RuntimeException {

    private OriginalExceptionReason originalExceptionReason;
    private Integer suggestedHttpStatusCode;
    private String personId;
    private String extraInformation;

    public LearningProjectRestException(String message) {
        super(message);
    }

    public LearningProjectRestException(String message, Throwable cause) {
        super(message, cause);
    }

    public LearningProjectRestException withPersonId(String personId) {
        if (StringUtils.isNoneBlank(personId)) {
            this.personId = StringUtils.trim(personId);
        }
        return this;
    }

    public LearningProjectRestException withExtraInformation(String extraInformation) {
        if (StringUtils.isNoneBlank(extraInformation)) {
            this.extraInformation = StringUtils.trim(extraInformation);
        }
        return this;
    }

    public LearningProjectRestException withOriginalExceptionReason(OriginalExceptionReason reason) {
        if (reason != null) {
            this.originalExceptionReason = reason;
        }
        return this;
    }

    public LearningProjectRestException withSuggestedHttpStatusCode(Integer httpStatusCode) {
        if (httpStatusCode != null) {
            this.suggestedHttpStatusCode = httpStatusCode;
        }
        return this;
    }
}
