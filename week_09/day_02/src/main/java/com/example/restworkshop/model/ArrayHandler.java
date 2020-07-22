package com.example.restworkshop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ArrayHandler {
    private String what;
    private List<Integer> numbers;

    public ArrayHandler() {
        this.numbers = new ArrayList<>();
    }

}
