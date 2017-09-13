package com.los.project.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDetails implements Serializable {
    private static final long serialVersionUID = -8740029290286144487L;

    private Long id;
    private User user;
}
