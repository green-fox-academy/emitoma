package com.example.restworkshop.controller;

import com.example.restworkshop.model.DTO.ErrorMessage;
import com.example.restworkshop.model.enities.Until;
import com.example.restworkshop.service.UntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UntilController {
    private UntilService untilService;

    @Autowired
    public UntilController(UntilService untilService) {
        this.untilService = untilService;
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action,
                                     @RequestBody Until until) {

        if (action.equals("sum")) {
            return ResponseEntity.status(200).body(untilService.sum(until));
        }
        if (action.equals("factor")) {
            return ResponseEntity.status(200).body(untilService.factor(until));
        }
        return ResponseEntity.status(400).body(new ErrorMessage("Please provide a number!"));
    }
}
