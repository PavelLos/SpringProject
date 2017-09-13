package com.los.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "group_profile")
@Data
public class GroupProfile implements Serializable {
    private static final long serialVersionUID = -1154511712481211086L;

    @Id
    @Column(name = "group_profile_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(optional = false, mappedBy = "groupProfile")
    private Group group;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "password")
    private String password;

    @Column(name = "image")
    private Image avatar;

}
