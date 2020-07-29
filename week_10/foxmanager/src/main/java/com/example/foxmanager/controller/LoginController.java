package com.example.foxmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String logIn() {
        return "login";
    }

    @PostMapping("/login")
    public String logIn(@RequestParam String name) {
        return "redirect:/home";
    }
}
