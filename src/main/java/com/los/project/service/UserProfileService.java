package com.los.project.service;

import com.los.project.entity.UserProfile;

public interface UserProfileService{
    UserProfile getUserProfileById(long id);
    UserProfile getUserProfileByLogin(String login);
    UserProfile getUserProfileByEmail(String email);
    UserProfile getUserProfileByEmailOrLogin(String email, String login);
}
