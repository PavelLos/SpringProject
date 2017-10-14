package com.los.project.controller;

import com.los.project.entity.User;
import com.los.project.entity.UserProfile;
import com.los.project.entity.enums.Sex;
import com.los.project.forms.UserEditProfileForm;
import com.los.project.service.UserProfileService;
import com.los.project.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/wall", "/"})
    public String welcomePage(Locale locale) {
        return "wall";
    }

    @GetMapping(value = {"/user/profile"})
    public String profilePage(Model model) {
        User user = userService.currentUser();
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping(value = "/user/profile/edit")
    public String editProfile(Model model, Errors errors) {
        User user = userService.currentUser();
        UserEditProfileForm editProfileForm = new UserEditProfileForm();
        model.addAttribute("user", user);
        model.addAttribute("editProfile", editProfileForm);
        return "edit_profile";
    }

    @PostMapping(value = "/user/profile/edit")
    public String editProfile(@ModelAttribute("editProfile") @Validated UserEditProfileForm userEditProfileForm, Errors errors) {
        User user = userService.currentUser();
        userProfileService.editUserProfile(user.getUserProfile(), userEditProfileForm);
        return "redirect:/user/profile";
    }
}
