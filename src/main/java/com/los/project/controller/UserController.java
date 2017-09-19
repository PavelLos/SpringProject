package com.los.project.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class UserController {


    @GetMapping(value = {"/"})
    @Secured("USER")
    public String welcomePage(Locale locale) {
        return "wall";
    }

    @GetMapping(value = {"/user/profile"})
    public String profilePage(){
        return "profile";
    }
}