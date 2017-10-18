package com.los.project.service.impl;

import com.los.project.entity.Image;
import com.los.project.entity.UserProfile;
import com.los.project.entity.enums.UserRole;
import com.los.project.forms.UserEditProfileForm;
import com.los.project.forms.UserRegistrationForm;
import com.los.project.repository.UserProfileRepository;
import com.los.project.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserProfile createNewProfile(final UserRegistrationForm registrationModel) {
        final UserProfile userProfile = new UserProfile();
        userProfile.setEmail(registrationModel.getEmail());
        userProfile.setLogin(registrationModel.getLogin());
        userProfile.setPasswordHash(passwordEncoder.encode(registrationModel.getPassword()));
        userProfile.setRole(UserRole.USER);
        userProfile.setAvatarImage(new Image());
        return userProfile;
    }

    @Override
    public UserProfile updateUserProfile(UserProfile userProfile) {
        userProfileRepository.saveAndFlush(userProfile);
        return userProfile;
    }

    @Override
    public UserProfile getUserProfileByLogin(String login) {
        return userProfileRepository.findUserProfileByLogin(login);
    }

    @Override
    public UserProfile getUserProfileByEmail(String email) {
        return userProfileRepository.findUserProfileByEmail(email);
    }

    @Override
    public UserProfile getUserProfileByEmailOrLogin(String email, String login) {
        return userProfileRepository.findUserProfileByEmailOrLogin(email, login);
    }


}
