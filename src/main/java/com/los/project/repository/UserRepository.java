package com.los.project.repository;

import com.los.project.entity.User;
import com.los.project.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByUserProfile(long id);
    User getUserByUserProfile(UserProfile userProfile);
}
