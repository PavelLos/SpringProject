package com.los.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "posts")
@Data
public class Post implements Serializable {
    private static final long serialVersionUID = -8887400083955217066L;

    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "post_text")
    private String postText;

    @Column(name = "tittle")
    private String title;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User publisher;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "post_images", joinColumns = @JoinColumn(name = "post_id"), inverseJoinColumns = @JoinColumn(name = "image_id"))
    private List<Image> images;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Comment> commentList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Rating> ratingList;

}
