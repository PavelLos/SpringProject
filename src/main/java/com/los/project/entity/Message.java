package com.los.project.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Data
public class Message implements Serializable {
    private static final long serialVersionUID = 5844130551289398884L;

    @Id
    @Column(name = "message_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messages_seq_gen")
    @SequenceGenerator(name = "messages_seq_gen", sequenceName = "message_id_seq")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "sender")
    private User sender;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "receiver")
    private User receiver;

    @Column(name = "message")
    private String message;

    @Column(name = "date")
    private LocalDateTime date;
}
