package com.los.project.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserRegistrationModel {
    @NotNull
    @Size(min = 2)
    private String login;

    @NotNull
    //@ValidEmail
    @Size(min = 6)
    private String email;

    @NotNull
    @Size(min = 6)
    private String password;


}
