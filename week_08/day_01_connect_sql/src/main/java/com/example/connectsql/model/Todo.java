package com.example.connectsql.model;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(nullable = false)
    private boolean isUrgent;

    @Column(nullable = false)
    private boolean isDone;


    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        this.isUrgent = urgent;
    }

    public boolean isIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        this.isDone = done;
    }
}
