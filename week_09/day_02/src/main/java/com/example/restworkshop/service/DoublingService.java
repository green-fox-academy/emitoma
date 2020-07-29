package com.example.restworkshop.service;

import com.example.restworkshop.model.enities.Doubling;
import org.springframework.stereotype.Service;

@Service
public class DoublingService {
    public Doubling doubler(int input){
        int result = input *2;
        return new Doubling(input,result);
    }
}
