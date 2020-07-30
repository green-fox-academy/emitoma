package com.example.todosqlproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean urgent = false;
    private boolean done = false;

    @ManyToOne
    private Assignee assignee;

//    @Column(name = "timestamp")
    @CreationTimestamp
    private Date timestamp;

    public Todo(String title) {
        this.title = title;
        this.timestamp = new Date();
    }
}
