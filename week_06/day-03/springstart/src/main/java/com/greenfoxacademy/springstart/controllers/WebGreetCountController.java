package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.GreetCounter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class WebGreetCountController {
    static long count;

    @RequestMapping("/web/greetingCount")
    public String greeting(Model model, @RequestParam(defaultValue = "name") String name) {
        count++;
        model.addAttribute("name", name);
        model.addAttribute("counter", count);
        return "greetingCounter";
    }


}
