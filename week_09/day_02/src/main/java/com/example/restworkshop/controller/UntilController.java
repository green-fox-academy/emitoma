package com.example.restworkshop.controller;

import com.example.restworkshop.model.DTO.ErrorMessage;
import com.example.restworkshop.model.enities.Until;
import com.example.restworkshop.service.LogService;
import com.example.restworkshop.service.UntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UntilController {
    private UntilService untilService;
    private LogService logService;


    @Autowired
    public UntilController(UntilService untilService, LogService logService) {
        this.untilService = untilService;
        this.logService = logService;
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action,
                                     @RequestBody Until until) {
        logService.saveLog("/dountil/{action}", new Date(), "action=" + action + ", until=" + until.getUntil());

        if (action.equals("sum")) {
            return ResponseEntity.status(200).body(untilService.sum(until));
        }
        if (action.equals("factor")) {
            return ResponseEntity.status(200).body(untilService.factor(until));
        }
        return ResponseEntity.status(400).body(new ErrorMessage("Please provide a number!"));
    }
}
