package com.example.restworkshop.model.enities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Result {
    private Integer result;

    public Result(Integer result) {
        this.result = result;
    }
}
