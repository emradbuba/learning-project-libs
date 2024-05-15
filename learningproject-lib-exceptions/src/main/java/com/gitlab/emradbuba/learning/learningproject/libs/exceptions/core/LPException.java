package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * The top most exception which can be thrown from all services being a part of the LearningProject
 */
@Getter
public class LPException extends RuntimeException {

    private LPExceptionErrorCode LPExceptionErrorCode;
    private Integer httpStatusCodeValue;
    private String solutionTip;
    private String personBusinessId;

    public LPException(String message) {
        super(message);
    }

    public LPException(String message, Throwable cause) {
        super(message, cause);
    }

    public LPException withHttpStatusCodeValue(Integer httpStatusCode) {
        if (httpStatusCode != null) {
            this.httpStatusCodeValue = httpStatusCode;
        }
        return this;
    }

    public LPException withLPExceptionErrorCode(LPExceptionErrorCode reason) {
        if (reason != null) {
            this.LPExceptionErrorCode = reason;
        }
        return this;
    }

    public LPException withSolutionTip(String solutionTip) {
        if (StringUtils.isNoneBlank(solutionTip)) {
            this.solutionTip = StringUtils.trim(solutionTip);
        }
        return this;
    }

    public LPException withPersonBusinessId(String personBusinessId) {
        if (personBusinessId != null) {
            this.personBusinessId = personBusinessId;
        }
        return this;
    }
}
