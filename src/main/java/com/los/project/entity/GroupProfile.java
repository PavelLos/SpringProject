package com.los.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "groups_profiles")
@Data
public class GroupProfile implements Serializable {
    private static final long serialVersionUID = -1154511712481211086L;

    @Id
    @Column(name = "group_profile_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groups_profiles_seq_gen")
    @SequenceGenerator(name = "groups_profiles_seq_gen", sequenceName = "group_profile_id_seq")
    private Long id;

    @OneToOne(mappedBy = "groupProfile", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
