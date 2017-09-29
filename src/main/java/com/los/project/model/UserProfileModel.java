package com.los.project.model;

import com.los.project.entity.Image;
import com.los.project.entity.enums.Sex;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserProfileModel {

    private String firstName;

    private String middleName;

    private String lastName;

    private Sex sex;

    private LocalDate birthday;

    private String email;

    private String phone;

    private Image avatarImage;
}
