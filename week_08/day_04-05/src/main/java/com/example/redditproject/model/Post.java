package com.example.redditproject.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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

    @Column(nullable = false)
    private String title;

    private String url;

    @Column(columnDefinition = "TEXT")
    private String postBody;

    @ManyToOne
    private User author;


    private int score;

    @DateTimeFormat(pattern = "yyyy-MM-dd@HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dateCreated;

    public Post(String title, String postBody, User author) {
        this.title = title;
        this.postBody = postBody;
        this.author = author;
    }
    public Post(String title,String url, String postBody, User author) {
        this.title = title;
        this.url = url;
        this.postBody = postBody;
        this.author = author;
    }


}
