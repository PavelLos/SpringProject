package com.los.project.controller;

import com.los.project.entity.UserProfile;
import com.los.project.model.UserProfileModel;
import com.los.project.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private UserProfileService userProfileService;

    @Secured(value={"ROLE_USER"})
    @GetMapping(value = {"/wall"})
    public String welcomePage(Locale locale) {
        return "wall";
    }

    @GetMapping(value = {"/user/profile"})
    public ModelAndView profilePage(SecurityManager securityManager, Principal principal){
        ModelAndView userProfileModel = new ModelAndView();
        UserProfile userProfile = userProfileService.getUserProfileByLogin(principal.getName());
        if (userProfile == null){
            userProfile = userProfileService.getUserProfileByEmail(principal.getName());
        }
        userProfileModel.setViewName("profile");
        userProfileModel.addObject(userProfile);
        return userProfileModel;
    }
}
