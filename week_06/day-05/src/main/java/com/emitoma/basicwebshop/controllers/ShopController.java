package com.emitoma.basicwebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShopController {

    @RequestMapping("/hello")
    public String home(Model model) {
        String hello = "Hello world";
        model.addAttribute("hello", hello);
        return "index";
    }

}
