package com.example.restworkshop.service;

import com.example.restworkshop.model.enities.Appended;
import org.springframework.stereotype.Service;

@Service
public class AppendService {
    public Appended appenda(String appendable) {
        String appended = appendable + "a";
        System.out.println(appended);
        return new Appended(appended);
    }
}
