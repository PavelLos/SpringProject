package com.los.project.entity.enums;

import lombok.Getter;

@Getter
public enum RatingType {
    LIKE("LIKE"),
    DISLIKE("DISLIKE");

    private String rating;

    RatingType(String rating) {
        this.rating = rating;
    }
}
