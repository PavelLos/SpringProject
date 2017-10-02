package com.los.project.service.impl;

import com.los.project.entity.CustomUserDetails;
import com.los.project.entity.User;
import com.los.project.entity.UserProfile;
import com.los.project.service.UserProfileService;
import com.los.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String emailOrLogin) throws UsernameNotFoundException {
        UserProfile userProfile = userProfileService.getUserProfileByEmailOrLogin(emailOrLogin, emailOrLogin);
        User user = userService.getUserByUserProfile(userProfile);
        if (user == null) {
            user = userService.getUserByUserProfile(userProfileService.getUserProfileByLogin(emailOrLogin));
            if (user == null)
                throw new UsernameNotFoundException(
                        "No user found with username: " + emailOrLogin);
        }
        return new CustomUserDetails(user);
    }
}
