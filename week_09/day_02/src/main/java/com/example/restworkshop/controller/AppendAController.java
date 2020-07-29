package com.example.restworkshop.controller;

import com.example.restworkshop.model.enities.Appended;
import com.example.restworkshop.service.AppendService;
import com.example.restworkshop.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
public class AppendAController {
    private LogService logService;
    private AppendService appendService;

    @Autowired
    public AppendAController(LogService logService, AppendService appendService) {
        this.logService = logService;
        this.appendService = appendService;
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appenda(@PathVariable String appendable) {

        logService.saveLog("/appenda", new Date(), appendable);

        if (appendable.isEmpty()) {
            return (ResponseEntity<?>) ResponseEntity.notFound();
        }

        return ResponseEntity.status(200).body(appendService.appenda(appendable));
    }
}
