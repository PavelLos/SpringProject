package com.los.project.repository;

import com.los.project.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    UserProfile findUserProfileByEmail(String email);
    UserProfile findUserProfileByLogin(String login);
}
