package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.notfound;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LPException;

public class LPPersonNotFoundException extends LPException {
    public LPPersonNotFoundException(String message) {
        super(message);
    }

    public LPPersonNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
