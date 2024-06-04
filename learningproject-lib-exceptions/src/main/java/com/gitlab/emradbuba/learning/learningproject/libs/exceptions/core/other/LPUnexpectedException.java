package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.other;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LPException;

public class LPUnexpectedException extends LPException {
    public LPUnexpectedException(String message) {
        super(message);
    }

    public LPUnexpectedException(String message, Throwable cause) {
        super(message, cause);
    }
}
