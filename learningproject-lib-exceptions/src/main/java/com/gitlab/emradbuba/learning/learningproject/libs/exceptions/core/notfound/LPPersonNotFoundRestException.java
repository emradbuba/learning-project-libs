package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.notfound;

import com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core.LearningProjectRestException;

public class LPPersonNotFoundRestException extends LearningProjectRestException {
    public LPPersonNotFoundRestException(String message) {
        super(message);
    }

    public LPPersonNotFoundRestException(String message, Throwable cause) {
        super(message, cause);
    }
}
