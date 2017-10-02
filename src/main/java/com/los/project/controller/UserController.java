package com.los.project.controller;

import com.los.project.entity.UserProfile;
import com.los.project.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping(value = {"/wall", "/"})
    public String welcomePage(Locale locale) {
        return "wall";
    }

    @GetMapping(value = {"/user/profile"})
    public String profilePage(Principal principal, Model model){
        UserProfile userProfile = userProfileService.getUserProfileByLogin(principal.getName());
        if (userProfile == null){
            userProfile = userProfileService.getUserProfileByEmail(principal.getName());
        }
        model.addAttribute("profile", userProfile);
        return "profile";
    }
}
