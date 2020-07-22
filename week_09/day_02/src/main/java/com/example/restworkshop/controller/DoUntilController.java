package com.example.restworkshop.controller;

import com.example.restworkshop.model.Address;
import com.example.restworkshop.model.Person;
import com.example.restworkshop.model.Until;
import com.example.restworkshop.service.DoUntilService;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class DoUntilController {
    private DoUntilService doUntilService;

    @Autowired
    public DoUntilController(DoUntilService doUntilService) {
        this.doUntilService = doUntilService;
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<? extends Object> dountil(@PathVariable(name = "action") String action,
                                                    @RequestBody Until until) {
        Integer number = until.getUntil();
        System.out.println(number);
        doUntilService.makeList(5);
        doUntilService.makeList(number);

        if (number == null) {
            return ResponseEntity.status(400).body("Please provide a number");
        } else if (action.equals("sum")) {
            return ResponseEntity.ok(this.doUntilService.sum());
        }

        return null;
    }
}
