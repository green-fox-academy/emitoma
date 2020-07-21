package com.example.restworkshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AppendAController {
    @GetMapping("/appenda/{appendable}")
    public HashMap<String, String> appenda(@PathVariable String appendable) {

        HashMap<String, String> responseData = new HashMap<>();
        responseData.put("appended", appendable + "a");
        return responseData;
    }
}
