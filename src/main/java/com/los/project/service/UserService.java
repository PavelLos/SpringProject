package com.los.project.service;

import com.los.project.entity.User;
import com.los.project.entity.UserProfile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService{
    User registrationUser(UserProfile userProfile);
    void authenticate(User user);
    User getUserByUserProfile(UserProfile userProfile);
    boolean loginExists(String login);
    boolean emailExists(String email);
    boolean isAuthenticated();
    User currentUser();
    boolean logout(HttpServletRequest request, HttpServletResponse response);
}
