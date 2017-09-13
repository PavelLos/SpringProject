package com.los.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "group")
@Data
public class Group implements Serializable {
    private static final long serialVersionUID = 8288674652342254686L;

    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private GroupProfile groupProfile;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private User admin;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "group_users", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "group_moderators", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "moderator_id"))
    private List<User> moderators;
}
