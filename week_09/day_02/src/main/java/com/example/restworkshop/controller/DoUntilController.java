package com.example.restworkshop.controller;

import com.example.restworkshop.model.enities.Until;
import com.example.restworkshop.service.DoUntilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
