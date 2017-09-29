package com.los.project.service.impl;

import com.los.project.entity.UserProfile;
import com.los.project.repository.UserProfileRepository;
import com.los.project.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public UserProfile getUserProfileById(long id) {
        return userProfileRepository.findUserProfileById(id);
    }

    @Override
    public UserProfile getUserProfileByLogin(String login) {
        return userProfileRepository.findUserProfileByLogin(login);
    }

    @Override
    public UserProfile getUserProfileByEmail(String email) {
        return getUserProfileByEmail(email);
    }

    @Override
    public UserProfile getUserProfileByEmailOrLogin(String email, String login) {
        return userProfileRepository.findUserProfileByEmailOrLogin(email, login);
    }


}
