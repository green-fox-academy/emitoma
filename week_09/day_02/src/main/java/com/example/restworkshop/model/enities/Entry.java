package com.example.restworkshop.model.enities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Entry {

    private List<Log> entries;
    private int entry_count;

    public Entry(){
        this.entries = new ArrayList<>();
    }
    public void addAll(List<Log> logs){
        entries.addAll(logs);
    }

}
