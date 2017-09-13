package com.los.project.service;

import com.los.project.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {
    void registrationUser(User user);

    void deleteUser(User user);

    User getUserById(long id);

    List<User> getUserList();

    List<User> getUserByLogin(String login);

    User getUserByEmail(String email);

}
