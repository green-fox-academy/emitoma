package com.greenfoxacademy.springstart;

public class Greeting {
    private long id;
    private String content;
    private String name;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
