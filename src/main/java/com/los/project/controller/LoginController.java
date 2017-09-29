package com.los.project.controller;

import com.los.project.entity.User;
import com.los.project.model.UserLoginModel;
import com.los.project.model.UserRegistrationModel;
import com.los.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class LoginController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/login", "/"})
    public String welcomePage(Locale locale, WebRequest webRequest, Model model) {
        UserRegistrationModel userRegistrationModel = new UserRegistrationModel();
        UserLoginModel userLoginModel = new UserLoginModel();
        model.addAttribute("loginForm", userLoginModel);
        model.addAttribute("registrationForm", userRegistrationModel);
        return "login";
    }

    @PostMapping(value = {"/login"})
    public String authorisationForm(@ModelAttribute("loginForm") @Valid UserLoginModel userLoginModel,
                                    BindingResult result, Errors errors) {
        /*if (result.hasErrors()) {
            return "login";
        }
        if (errors.hasErrors()) {
            return "login";
        }
        User user = userService.registrationUser(registrationModel);
        if (user == null) {
            return "login";
        }*/
        return "login";
    }
}
