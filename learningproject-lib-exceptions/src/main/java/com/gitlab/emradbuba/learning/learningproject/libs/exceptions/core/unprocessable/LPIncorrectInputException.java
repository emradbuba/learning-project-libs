package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.unprocessable;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LPException;

public class LPIncorrectInputException extends LPException {
    public LPIncorrectInputException(String message) {
        super(message);
    }

    public LPIncorrectInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
