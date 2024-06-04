package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.notfound;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LPException;

public class LPEmploymentCertNotFoundException extends LPException {

    public LPEmploymentCertNotFoundException(String message) {
        super(message);
    }

    public LPEmploymentCertNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
