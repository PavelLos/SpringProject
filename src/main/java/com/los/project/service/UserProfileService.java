package com.los.project.service;

import com.los.project.forms.UserEditProfileForm;
import com.los.project.forms.UserRegistrationForm;
import com.los.project.entity.User;
import com.los.project.entity.UserProfile;

public interface UserProfileService{

    UserProfile createNewProfile(UserRegistrationForm registrationModel);
    UserProfile updateUserProfile(UserProfile userProfile);

    UserProfile getUserProfileByLogin(String login);
    UserProfile getUserProfileByEmail(String email);
    UserProfile getUserProfileByEmailOrLogin(String email, String login);
}
