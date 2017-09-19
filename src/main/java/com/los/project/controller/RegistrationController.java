package com.los.project.controller;

import com.los.project.entity.User;
import com.los.project.model.UserRegistrationModel;
import com.los.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;

@Controller
@Slf4j
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping(value = {"/registration"})
    public String registrationForm(@ModelAttribute("registrationForm") @Valid UserRegistrationModel profileModel,
                                   BindingResult result, WebRequest request, Errors errors) {
        log.info("Registering user account with information: {}", profileModel);

        if (result.hasErrors()) {
            return "login";
        }
        if(errors.hasErrors()){
            return "login";
        }
        User user = userService.registrationUser(profileModel);

        if (user == null) {
            return "login";
        }



        return "login";
    }
}
