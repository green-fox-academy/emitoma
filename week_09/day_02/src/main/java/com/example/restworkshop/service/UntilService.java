package com.example.restworkshop.service;

import com.example.restworkshop.model.enities.Result;
import com.example.restworkshop.model.enities.Until;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class UntilService {
    public Result sum(Until until) {
        int sum = 0;
        for (int i = 0; i <= until.getUntil(); i++) {
            sum += i;
        }
        System.out.println(sum);
        return new Result((Integer) sum);
    }

    public Result factor(Until until) {
//        public int factorial(int n) {
//            IntStream stream = IntStream.rangeClosed(1, n);
//            return stream.reduce(1, (a, b) -> a * b);
//        }
        int n = until.getUntil();
        IntStream stream = IntStream.rangeClosed(1, n);
        Result result = new Result();
        result.setResult(stream.reduce(1, (a, b) -> a * b));
        System.out.println(result);
        return result;
    }
}
