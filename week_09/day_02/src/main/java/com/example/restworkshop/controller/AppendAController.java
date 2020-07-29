package com.example.restworkshop.controller;

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

    @Autowired
    public AppendAController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/appenda/{appendable}")
    public HashMap<String, String> appenda(@PathVariable String appendable) {
        logService.saveLog("/appenda", new Date(), appendable);
        HashMap<String, String> responseData = new HashMap<>();
        responseData.put("appended", appendable + "a");
        return responseData;
    }
}
