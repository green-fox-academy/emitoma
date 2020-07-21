package com.example.restworkshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
