package com.los.project.entity;


import com.los.project.entity.enums.Sex;
import com.los.project.entity.enums.UserRole;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "user_profile")
public class UserProfile implements Serializable {
    private static final long serialVersionUID = 7501382330464013767L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(mappedBy = "userProfile", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

    @Column(name = "login")
    private String login;

    @Column(name = "passwordHash")
    private String passwordHash;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "avatarImage")
    private Image avatarImage;
}
