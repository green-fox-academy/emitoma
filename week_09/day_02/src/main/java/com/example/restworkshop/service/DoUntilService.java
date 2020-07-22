package com.example.restworkshop.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoUntilService {
    List<Integer> numbers = new ArrayList<>();

    public void makeList(int biggestNum) {
        for (int i = 0; i < biggestNum+1; i++) {
            numbers.add(i);
        }
    }

    public int sum() {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public int factorUntil(Integer number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
