package com.los.project.entity.enums;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ADMIN"),
    USER("USER"),
    ANONYMOUS("ANONYMOUS");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

}
