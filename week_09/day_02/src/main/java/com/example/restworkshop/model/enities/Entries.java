package com.example.restworkshop.model.enities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Entries {
    private ArrayList<Log> entries;

    public Entries() {
        this.entries = new ArrayList<>();
    }

    public void addLog(Log log) {
        entries.add(log);
    }

    public int numOfEntries() {
        return entries.size();
    }
}
