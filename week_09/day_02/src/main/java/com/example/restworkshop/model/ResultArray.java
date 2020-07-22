package com.example.restworkshop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ResultArray {
    private ArrayList<Integer> result;

    public ResultArray() {
        this.result = new ArrayList<>();
    }
}
