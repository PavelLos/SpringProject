package com.los.project.converter;

import com.los.project.entity.UserProfile;
import com.los.project.forms.UserEditProfileForm;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserProfileFormToUserProfile implements Converter<UserEditProfileForm, UserProfile> {
    @Override
    public UserProfile convert(UserEditProfileForm userEditProfileForm) {
        return null;
    }
}
