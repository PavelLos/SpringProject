package com.los.project.converter;

import com.los.project.entity.Image;
import com.los.project.entity.UserProfile;
import com.los.project.forms.UserEditProfileForm;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public class UserProfileToUserProfileForm implements Converter<UserProfile, UserEditProfileForm> {
    @Override
    public UserEditProfileForm convert(UserProfile userProfile) {
        UserEditProfileForm profileForm = new UserEditProfileForm();
        profileForm.setLogin(userProfile.getLogin());
        profileForm.setPassword(userProfile.getPasswordHash());
        profileForm.setFirstName(userProfile.getFirstName());
        profileForm.setMiddleName(userProfile.getMiddleName());
        profileForm.setLastName(userProfile.getLastName());
        profileForm.setUserRole(userProfile.getRole());
        profileForm.setEmail(userProfile.getEmail());
        profileForm.setPhone(userProfile.getPhone());
        profileForm.setBirthday(String.valueOf(userProfile.getBirthday()));
        profileForm.setSex(userProfile.getSex());
        profileForm.setAvatarImage(userProfile.getAvatarImage());
        return profileForm;
    }


}
