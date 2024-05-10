package com.gitlab.emradbuba.learning.learningproject.libs.exceptions.core;

public enum LearningProjectExceptionReason {

    PERSON_ID_NOT_FOUND("person_id_not_found", "Given personId does not exist in database"),

    ID_CARD_ID_NOT_FOUND("id_card_id_not_found", "Person does not have IDCard with given id"),
    ID_CARD_ALREADY_DEFINED("id_card_already_defined", "Person already has an ID Card - cannot add next one");

    // TODO: Define next cases

    private final String reasonCode;
    private final String description;

    LearningProjectExceptionReason(String reasonCode, String description) {
        this.reasonCode = reasonCode;
        this.description = description;
    }
}
