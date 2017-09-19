package com.los.project.controller;

import com.los.project.model.UserLoginModel;
import com.los.project.model.UserRegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Locale;

@Controller
public class LoginController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(value = {"/login"})
    public String welcomePage(Locale locale, WebRequest webRequest, Model model) {
        UserRegistrationModel userRegistrationModel = new UserRegistrationModel();
        UserLoginModel userLoginModel = new UserLoginModel();
        model.addAttribute("loginForm", userLoginModel);
        model.addAttribute("registrationForm", userRegistrationModel);
        return "login";
    }

    @PostMapping(value = {"/login"})
    public String authorisationForm() {
        String message = "";
        return "login";
    }
}
