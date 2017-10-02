package com.los.project.controller;

import com.los.project.forms.UserLoginForm;
import com.los.project.forms.UserRegistrationForm;
import com.los.project.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Locale;

@Controller
public class LoginController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/login"})
    public String welcomePage(Locale locale, WebRequest webRequest, Model model) {
        ModelAndView modelAndView = new ModelAndView();
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        UserLoginForm userLoginForm = new UserLoginForm();
        model.addAttribute("loginForm", userLoginForm);
        model.addAttribute("registrationForm", userRegistrationForm);
        return "login";
    }

    @GetMapping(value="/logout")
    public String logout (HttpServletRequest request, HttpServletResponse response) {
        if (userService.logout(request, response)){
            return "redirect:/wall";
        }
        return "redirect:/login";
    }

    /*@PostMapping(value = {"/login"})
    public String authorisationForm(@ModelAttribute("loginForm") @Valid UserLoginForm userLoginForm,
                                    BindingResult result, Errors errors) {
        *//*if (result.hasErrors()) {
            return "login";
        }
        if (errors.hasErrors()) {
            return "login";
        }
        User user = userService.registrationUser(registrationModel);
        if (user == null) {
            return "login";
        }*//*
        return "login";
    }*/
}
