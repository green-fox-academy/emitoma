package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.GreetCounter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class GreetCounterController {
    static long count;
        //missing AtomicLong class
    @RequestMapping("/greetingCount")
    public GreetCounter greeting(@RequestParam(defaultValue = "name") String name) {
        GreetCounter greeting = new GreetCounter(count, "Hello " + name + "!");
        count++;
        return greeting;
    }
}
