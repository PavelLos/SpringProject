package com.los.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {


    @GetMapping(value = {"/login", "/"})
    public String welcomePage() {
        return "login";
    }

    @PostMapping(value = {"/login"})
    public String authorisationForm() {
        String message = "";
        return "login";
    }
}
