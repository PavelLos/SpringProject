package com.los.project.service.impl;

import com.los.project.entity.User;
import com.los.project.entity.UserProfile;
import com.los.project.entity.enums.UserRole;
import com.los.project.model.UserProfileModel;
import com.los.project.repository.UserProfileRepository;
import com.los.project.repository.UserRepository;
import com.los.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public User registrationUser(final UserProfileModel userModel) {
        log.info("Registration new user: " + userModel);
        final User user = new User();
        UserProfile userProfile = new UserProfile();
        userProfile.setEmail(userModel.getEmail());
        userProfile.setLogin(userModel.getLogin());
        userProfile.setPasswordHash(passwordEncoder.encode(userModel.getPassword()));
        userProfile.setRole(UserRole.USER);

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
    public void deleteUser(User user) {

    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public List<User> getUserByLogin(String login) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
