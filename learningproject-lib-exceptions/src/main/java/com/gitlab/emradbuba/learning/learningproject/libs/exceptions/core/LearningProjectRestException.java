package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * The top most exception which can be thrown from all services being a part of the LearningProject
 */
@Getter
public class LearningProjectRestException extends RuntimeException {

    private LearningProjectErrorCode learningProjectErrorCode;
    private Integer httpStatusCode;
    private String solutionTip;

    public LearningProjectRestException(String message) {
        super(message);
    }

    public LearningProjectRestException(String message, Throwable cause) {
        super(message, cause);
    }

    public LearningProjectRestException withHttpStatusCode(Integer httpStatusCode) {
        if (httpStatusCode != null) {
            this.httpStatusCode = httpStatusCode;
        }
        return this;
    }

    public LearningProjectRestException withLearningProjectErrorCode(LearningProjectErrorCode reason) {
        if (reason != null) {
            this.learningProjectErrorCode = reason;
        }
        return this;
    }

    public LearningProjectRestException withSolutionTip(String solutionTip) {
        if (StringUtils.isNoneBlank(solutionTip)) {
            this.solutionTip = StringUtils.trim(solutionTip);
        }
        return this;
    }
}
