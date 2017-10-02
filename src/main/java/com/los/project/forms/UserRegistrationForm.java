package com.los.project.forms;

import com.los.project.validation.annotations.ValidEmail;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserRegistrationForm {
    @NotNull
    @Size(min = 1)
    private String login;

    @ValidEmail
    @NotNull
    @Size(min = 1)
    private String email;

    @NotNull
    @Size(min = 6)
    private String password;


}
