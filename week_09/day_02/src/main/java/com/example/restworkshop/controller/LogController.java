package com.example.restworkshop.controller;

import com.example.restworkshop.service.LogService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/log")
    public ResponseEntity<? extends Object> log(){
        return ResponseEntity.status(200).body(logService.findAll());
    }
}
