package com.example.restworkshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class DoublingController {

    @GetMapping("/doubling")
    public Map doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            HashMap<String, String> responseData = new HashMap<>();
            responseData.put("error", "Please provide an input!");
            return responseData;
        }
        HashMap<String, Integer> responseData = new HashMap<>();
        responseData.put("received", input);
        responseData.put("result", input * 2);
        return responseData;

    }


}
