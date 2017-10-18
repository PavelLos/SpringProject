package com.los.project.forms;

import com.los.project.entity.Image;
import com.los.project.entity.enums.Sex;
import com.los.project.entity.enums.UserRole;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Getter
@Setter
public class UserEditProfileForm {

    private String login;

    private String password;

    private String firstName;

    private String middleName;

    private String lastName;

    private Sex sex;

    private UserRole userRole;

    private String birthday;

    private String email;

    private String phone;

    private MultipartFile imageFile;
    private Image avatarImage;
}
