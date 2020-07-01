package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class GreetCounter {
    private long greetCount;
    private String content;

    public GreetCounter(long greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public long getGreetCount() {
        return greetCount;
    }


    public String getContent() {
        return content;
    }
}
