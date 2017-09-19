package com.los.project.service;

import com.los.project.entity.User;
import com.los.project.model.UserRegistrationModel;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User registrationUser(UserRegistrationModel userModel);

    void deleteUser(User user);

    User getUserById(long id);

    List<User> getUserList();

    List<User> getUserByLogin(String login);

    User getUserByEmail(String email);

}
