package com.example.restworkshop.controller;

import com.example.restworkshop.model.DTO.ErrorMessage;
import com.example.restworkshop.service.DoublingService;
import com.example.restworkshop.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class DoublingController {
    private DoublingService doublingService;
    private LogService logService;

    @Autowired
    public DoublingController(DoublingService doublingService, LogService logService) {
        this.doublingService = doublingService;
        this.logService = logService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {

        logService.saveLog("/doubling", new Date(), "input=" + input);

        if (input == null) {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        }
        return ResponseEntity.status(200).body(doublingService.doubler(input));

    }


}
