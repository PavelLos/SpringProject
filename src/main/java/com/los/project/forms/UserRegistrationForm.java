package com.los.project.forms;

import com.los.project.validation.annotations.ValidEmail;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserRegistrationForm {
    @Size(min = 2)
    private String login;

    @Size(min = 6)
    @ValidEmail
    private String email;

    @Size(min = 6)
    private String password;


}
