package com.los.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {


    @GetMapping(value = {"/login", "/"})
    public String welcomePage(Model model) {
        String message = "";
        return "login";
    }

    @PostMapping(value = {"/login"})
    public String authorisationForm() {
        String message = "";
        return "login";
    }
}
