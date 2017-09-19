package com.los.project.model;

import com.los.project.validation.annotations.ValidEmail;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserRegistrationModel {
    @NotNull
    @NotEmpty
    private String login;

    @NotNull
    @NotEmpty
    @ValidEmail
    @Size(min = 6)
    private String email;

    @NotNull
    @NotEmpty
    @Size(min = 6)
    private String password;


}
