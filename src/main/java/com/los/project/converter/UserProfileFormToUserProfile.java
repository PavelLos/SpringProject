package com.los.project.converter;

import com.los.project.entity.Image;
import com.los.project.entity.UserProfile;
import com.los.project.forms.UserEditProfileForm;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;

@Component
public class UserProfileFormToUserProfile implements Converter<UserEditProfileForm, UserProfile> {
    @Override
    public UserProfile convert(UserEditProfileForm userEditProfileForm) {
        UserProfile userProfile = new UserProfile();
        userProfile.setLogin(userEditProfileForm.getLogin());
        userProfile.setPasswordHash(userEditProfileForm.getPassword());

        userProfile.setFirstName(userEditProfileForm.getFirstName());
        userProfile.setLastName(userEditProfileForm.getLastName());
        userProfile.setMiddleName(userEditProfileForm.getMiddleName());

        userProfile.setEmail(userEditProfileForm.getEmail());
        userProfile.setRole(userEditProfileForm.getUserRole());
        userProfile.setPhone(userEditProfileForm.getPhone());
        userProfile.setBirthday(LocalDate.parse(userEditProfileForm.getBirthday()));
        userProfile.setSex(userEditProfileForm.getSex());
        userProfile.setAvatarImage(multipartFileToImage(userEditProfileForm.getImageFile()));
        return userProfile;
    }

    private Image multipartFileToImage(MultipartFile file){
        Image avatar = new Image();
        try {
            avatar.setImage(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return avatar;
    }
}
