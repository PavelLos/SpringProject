package com.los.project.service.impl;

import com.los.project.entity.UserProfile;
import com.los.project.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserProfileService userProfileService;

    @Override
    public UserDetails loadUserByUsername(String emailOrLogin) throws UsernameNotFoundException {
        UserProfile user = userProfileService.getUserProfileByEmailOrLogin(emailOrLogin, emailOrLogin);
        if (user == null) {
            throw new UsernameNotFoundException(
                    "No user found with username: " + emailOrLogin);
        }
        return buildUserForAuthentication(user);
    }

    private org.springframework.security.core.userdetails.User buildUserForAuthentication(UserProfile userProfile) {
        return new org.springframework.security.core.userdetails.User(userProfile.getEmail(), userProfile.getPasswordHash(),
                true, true, true, true, getAuthorities(userProfile.getRole().getRole()));
    }

    private static List<GrantedAuthority> getAuthorities(String roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        /*for (UserRole role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }*/
        authorities.add(new SimpleGrantedAuthority("ROLE_" + roles));
        return authorities;
    }
}
