package com.los.project.controller;

import com.los.project.entity.User;
import com.los.project.entity.UserProfile;
import com.los.project.forms.UserEditProfileForm;
import com.los.project.service.UserProfileService;
import com.los.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private UserService userService;

    @Autowired
    private ConversionService conversionService;


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
    public String editProfile(Model model) {
        UserEditProfileForm editProfileForm = conversionService.convert(userService.currentUser().getUserProfile(), UserEditProfileForm.class);
        model.addAttribute("editProfile", editProfileForm);
        return "edit_profile";
    }

    @PostMapping(value = "/user/profile/edit")
    public String editProfile(@ModelAttribute("editProfile") @Validated UserEditProfileForm userEditProfileForm, Errors errors) {
        UserProfile currentProfile = userService.currentUser().getUserProfile();
        UserProfile userProfile = conversionService.convert(userEditProfileForm, UserProfile.class);
        userProfile.setId(currentProfile.getId());
        userProfileService.updateUserProfile(userProfile);
        return "redirect:/user/profile/edit";
    }

/*    @RequestMapping(value = "/upload_avatar", method = RequestMethod.POST)
    public @ResponseBody String uploadAvatar(@RequestParam("avatarFile") MultipartFile file) throws IOException {
        try {
            UploadedAvatarInfo result = avatarService.upload(file);

            userService.changeAvatar(result);

            return makeAvatarUploadResponse("ok", result);
        } catch (UnsupportedFormatException e) {
            return makeAvatarUploadResponse("invalid_format", null);
        }
    }*/

}
