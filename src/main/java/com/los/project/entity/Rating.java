package com.los.project.entity;

import com.los.project.entity.enums.RatingType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ratings")
@Data
public class Rating implements Serializable {
    private static final long serialVersionUID = -394491360254185591L;

    @Id
    @Column(name = "rating_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ratings_seq_gen")
    @SequenceGenerator(name = "ratings_seq_gen", sequenceName = "rating_id_seq")
    private Long id;

    @Column(name = "rating_type")
    @Enumerated(EnumType.STRING)
    private RatingType ratingType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User publisher;

}
