package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * The top most exception which can be thrown from all services being a part of the LearningProject
 */
@Getter
public class LearningProjectException extends RuntimeException {

    private String uniqueErrorCode;
    private Integer httpStatusCodeValue;
    private String description;
    private String solutionTip;
    private String personBusinessId;

    public LearningProjectException(String message) {
        super(message);
    }

    public LearningProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public LearningProjectException withHttpStatusCodeValue(Integer httpStatusCode) {
        if (httpStatusCode != null) {
            this.httpStatusCodeValue = httpStatusCode;
        }
        return this;
    }

    public LearningProjectException withUniqueErrorCode(String reason) {
        if (StringUtils.isNoneBlank(reason)) {
            this.uniqueErrorCode = reason;
        }
        return this;
    }

    public LearningProjectException withDescription(String description) {
        if (StringUtils.isNoneBlank(description)) {
            this.description = description;
        }
        return this;
    }

    public LearningProjectException withSolutionTip(String solutionTip) {
        if (StringUtils.isNoneBlank(solutionTip)) {
            this.solutionTip = StringUtils.trim(solutionTip);
        }
        return this;
    }

    public LearningProjectException withPersonBusinessId(String personBusinessId) {
        if (StringUtils.isNoneBlank(personBusinessId)) {
            this.personBusinessId = personBusinessId;
        }
        return this;
    }
}
