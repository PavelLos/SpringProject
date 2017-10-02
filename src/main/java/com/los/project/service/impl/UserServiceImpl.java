package com.los.project.service.impl;

import com.los.project.entity.User;
import com.los.project.entity.UserProfile;
import com.los.project.repository.UserProfileRepository;
import com.los.project.repository.UserRepository;
import com.los.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public User registrationUser(final UserProfile userProfile) {
        log.info("Registration new user: " + userProfile);
        final User user = new User();
        user.setUserProfile(userProfile);
        user.setMessages(new ArrayList<>());
        user.setPostList(new ArrayList<>());
        user.setCommentList(new ArrayList<>());
        user.setRatingList(new ArrayList<>());
        user.setGroupList(new ArrayList<>());
        userRepository.saveAndFlush(user);
        return user;
    }

    @Override
    public void authenticate(User user) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUserProfile().getEmail());
        Authentication auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(auth);
    }



    @Override
    public User getUserByUserProfile(UserProfile userProfile) {
        return userRepository.getUserByUserProfile(userProfile);
    }

    @Override
    public boolean loginExists(String login) {
        return userProfileRepository.findUserProfileByLogin(login) != null;
    }

    @Override
    public boolean emailExists(String email) {
        return userProfileRepository.findUserProfileByEmail(email) != null;
    }

    @Override
    public boolean isAuthenticated() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication auth = securityContext.getAuthentication();
        return auth != null && !(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated();
    }

    @Override
    public User currentUser() {
        if (!isAuthenticated())
            return null;
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication auth = securityContext.getAuthentication();
        return userRepository.getUserByUserProfile(userProfileRepository.findUserProfileByEmailOrLogin(auth.getName(), auth.getName()).getId());
    }

    @Override
    public boolean logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return isAuthenticated();
    }

}
