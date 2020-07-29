package com.example.restworkshop.controller;

import com.example.restworkshop.model.enities.Entry;
import com.example.restworkshop.model.enities.Log;
import com.example.restworkshop.service.LogService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogController {
    private LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/log")
    public Entry log() {
        Entry allEntries = new Entry();
        allEntries.addAll(logService.findAll());
        allEntries.setEntry_count(logService.logCount());
        return allEntries;

    }
}
