package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.notfound;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LPException;

public class LPAddressNotFoundException extends LPException {

    public LPAddressNotFoundException(String message) {
        super(message);
    }

    public LPAddressNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
