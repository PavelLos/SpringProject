package com.los.project.validation;

import com.los.project.entity.User;
import com.los.project.forms.UserRegistrationForm;
import com.los.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserRegistrationForm userRegistrationForm = (UserRegistrationForm) o;

        if (!StringUtils.isEmpty(userRegistrationForm.getEmail())) {
            if (userService.loginExists(userRegistrationForm.getLogin())) {
                errors.rejectValue("username", "Registered");
            }
        }

        if (!StringUtils.isEmpty(userRegistrationForm.getEmail())) {
            User currentUser = userService.currentUser();

            if (currentUser == null || !currentUser.getUserProfile().getEmail().equalsIgnoreCase(userRegistrationForm.getEmail())) {
                if (userService.emailExists(userRegistrationForm.getEmail())) {
                    errors.rejectValue("email", "Registered");
                }
            }
        }
    }
}
