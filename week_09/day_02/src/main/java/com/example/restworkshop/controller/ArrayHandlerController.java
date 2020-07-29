package com.example.restworkshop.controller;

import com.example.restworkshop.model.enities.ArrayHandler;
import com.example.restworkshop.model.DTO.ErrorMessage;
import com.example.restworkshop.service.ArrayHandlerService;
import com.example.restworkshop.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ArrayHandlerController {

    private ArrayHandlerService arrayHandlerService;
    private LogService logService;

    @Autowired
    public ArrayHandlerController(ArrayHandlerService arrayHandlerService, LogService logService) {
        this.arrayHandlerService = arrayHandlerService;
        this.logService = logService;
    }

    @PostMapping("/arrays")
    public ResponseEntity<? extends Object> arrayHandler(@RequestBody ArrayHandler arrayHandler) {
        logService.saveLog("/arrays", new Date(), arrayHandler.getWhat());
        if (arrayHandler.getWhat().equals("sum")) {
            return ResponseEntity.status(200).body(arrayHandlerService.sum(arrayHandler));
        } else if (arrayHandler.getWhat().equals("multiply")) {
            return ResponseEntity.status(200).body(arrayHandlerService.multiply(arrayHandler));
        } else if (arrayHandler.getWhat().equals("double")) {
            return ResponseEntity.status(200).body(arrayHandlerService.doublenums(arrayHandler));
        }
        if (arrayHandler.getNumbers().isEmpty()) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide what to do with the numbers!"));
        }
        return ResponseEntity.status(400).body(new ErrorMessage("Please provide what to do with the numbers!"));

    }

}
