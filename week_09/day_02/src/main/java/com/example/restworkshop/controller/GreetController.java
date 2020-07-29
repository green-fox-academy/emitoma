package com.example.restworkshop.controller;

import com.example.restworkshop.model.DTO.ErrorMessage;
import com.example.restworkshop.model.enities.Person;
import com.example.restworkshop.model.enities.WelcomeMessage;
import com.example.restworkshop.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@RestController
public class GreetController {
    private LogService logService;

    @Autowired
    public GreetController(LogService logService) {
        this.logService = logService;
    }


    @GetMapping("/greeter")
    public ResponseEntity<?> greeting(@RequestParam(required = false) String name,
                                      @RequestParam(required = false) String title,
                                      HttpServletResponse response) {
        logService.saveLog("/greeter", new Date(), "name=" + name + ", title=" + title);

        Person person = new Person(name, title);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.setContentType(MediaType.valueOf("application/json;charset=UTF-8"));


        if (name == null && title == null) {
            return ResponseEntity.status(400).headers(responseHeader).body(new ErrorMessage("Please provide a name and a title!"));
        } else if (name == null) {
            return ResponseEntity.status(400).headers(responseHeader).body(new ErrorMessage("Please provide a name!"));
        } else if (title == null) {
            return ResponseEntity.status(400).headers(responseHeader).body(new ErrorMessage("Please provide a title!"));
        }
        return ResponseEntity.status(200).headers(responseHeader)
                .body(new WelcomeMessage("Oh, hi there " + person.getName() + ", my dear " + person.getTitle() + "!"));

    }


}
