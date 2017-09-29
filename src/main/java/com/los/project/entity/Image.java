package com.los.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "images")
@Data
public class Image implements Serializable {
    private static final long serialVersionUID = -167375234561528913L;

    @Id
    @Column(name = "image_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "path")
    private String path;

    @Column(name = "description")
    private String description;
}
