package com.los.project.entity.enums;

import lombok.Getter;

@Getter
public enum Sex {
    MALE("MALE"),
    FEMALE("FEMALE");

    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }
}
