package com.foxclub.programmerfoxclub.controllers;

import com.foxclub.programmerfoxclub.model.Drink;
import com.foxclub.programmerfoxclub.model.Food;
import com.foxclub.programmerfoxclub.model.Fox;
import com.foxclub.programmerfoxclub.model.Trick;
import com.foxclub.programmerfoxclub.service.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private FoxList foxList;


    @RequestMapping("/")
    public String home(@RequestParam(defaultValue = "Mr Fox") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String getName(@RequestParam String name, Model model) {

        if (foxList.findMyFox(name).equals(name.toLowerCase())) {
            return "redirect:/";
        } else if (!foxList.findMyFox(name).contains(name.toLowerCase())) {
            return "redirect:/login";
        }
        return "login";
    }


}
