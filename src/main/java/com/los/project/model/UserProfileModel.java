package com.los.project.model;

import com.los.project.validation.annotations.ValidEmail;
import com.los.project.validation.annotations.ValidPassword;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserProfileModel {
    @NotNull
    @NotEmpty
    private String login;

    @NotNull
    @NotEmpty
    @ValidEmail
    private String email;

    @NotNull
    @NotEmpty
    @ValidPassword
    private String password;
}
