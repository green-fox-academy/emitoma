package com.example.foxclub.controllers;

import jdk.jfr.Registered;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String register(@RequestParam(defaultValue = "true") boolean passwordOk, Model model) {
        model.addAttribute("passwordOk", passwordOk);
        return "register";
    }

    @PostMapping("/register")
    public String saveReg(@RequestParam String userName, @RequestParam String password, @RequestParam String passwordConfirmation) {
        if (!password.equals(passwordConfirmation)) {
            return "redirect:/register?passwordOk=false";
        }
        return "redirect:/login";
    }
}
