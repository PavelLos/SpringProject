package com.los.project.forms;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserLoginForm {

    @NotNull
    @NotEmpty
    @Size(min = 6)
    private String loginOrEmail;

    @NotNull
    @NotEmpty
    @Size(min = 6)
    private String password;
}
