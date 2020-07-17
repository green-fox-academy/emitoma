package com.example.redditproject.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String url;

    @ManyToOne
    private User author;

    private int score;

    private Date dateCreated;

    public Post(String title, String url, User author ) {
        this.title = title;
        this.url = url;
        this.author = author;
    }
}
