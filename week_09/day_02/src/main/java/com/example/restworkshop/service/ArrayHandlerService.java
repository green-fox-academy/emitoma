package com.example.restworkshop.service;

import com.example.restworkshop.model.ArrayHandler;
import com.example.restworkshop.model.Result;
import com.example.restworkshop.model.ResultArray;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ArrayHandlerService {

    public Result sum(ArrayHandler arrayHandler) {
        Result sumResult = new Result();
        sumResult.setResult(
                arrayHandler.getNumbers().stream()
                        .mapToInt(Integer::intValue)
                        .sum()
        );
        return sumResult;
    }

    public Result multiply(ArrayHandler arrayHandler) {
        Result multiplyResult = new Result();
        multiplyResult.setResult(arrayHandler.getNumbers().stream()
                .mapToInt(Integer::intValue)
                .reduce(
                        1,
                        (a, b) -> a * b
                ));
        return multiplyResult;
    }

    public ResultArray doublenums(ArrayHandler arrayHandler) {
        ResultArray doubleResult = new ResultArray();
        ArrayList<Integer> doubledArray = new ArrayList<>();
        for (Integer num : arrayHandler.getNumbers()) {
            doubledArray.add(num * 2);
        }
        doubleResult.setResult(doubledArray);
        return doubleResult;
    }
}
