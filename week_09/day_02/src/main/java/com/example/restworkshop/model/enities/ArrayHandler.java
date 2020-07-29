package com.example.restworkshop.model.enities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class ArrayHandler {
    private String what;
    private List<Integer> numbers;

    public ArrayHandler() {
        this.numbers = new ArrayList<>();
    }

    public String toString(){
        return "what=" + this.what + ", numbers=" + this.numbers;
    }
}
