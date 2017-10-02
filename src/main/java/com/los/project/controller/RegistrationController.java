package com.los.project.controller;

import com.los.project.entity.User;
import com.los.project.forms.UserRegistrationForm;
import com.los.project.entity.UserProfile;
import com.los.project.service.UserProfileService;
import com.los.project.service.UserService;
import com.los.project.validation.RegistrationValidator;
import com.los.project.validation.UserValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@Slf4j
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private RegistrationValidator registrationValidator;

    @Autowired
    private UserValidator userValidator;


    @PostMapping(value = {"/registration"})
    public String registrationForm(@ModelAttribute("registrationForm") @Valid UserRegistrationForm registrationModel,
                                   BindingResult result, Errors errors, HttpSession session) {
        log.info("Registering user account with information: {}", registrationModel);
        userValidator.validate(registrationModel, errors);
        //registrationValidator.validate(registrationModel, result);
        if (result.hasErrors() || errors.hasErrors()) {
            return "login";
        }
        UserProfile userProfile = userProfileService.createNewProfile(registrationModel);
        if(userProfile == null){
            return "login";
        }
        User user = userService.registrationUser(userProfile);
        if (user == null) {
            return "login";
        }
        userService.authenticate(user);
        return "redirect:wall";
    }
}
