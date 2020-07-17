package com.example.foxclub.controllers;

import com.example.foxclub.model.Drink;
import com.example.foxclub.model.Food;
import com.example.foxclub.model.Fox;
import com.example.foxclub.model.Trick;
import com.example.foxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class MainController {

    private FoxService foxService;

    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping("/")
    public String foxMain(@RequestParam(defaultValue = "Foxy") String name, Model model) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (optionalFox.isPresent()) {
            Fox foundFox = optionalFox.get();
            model.addAttribute("fox", foundFox);
            model.addAttribute("trickList", foundFox.getTrickList());
        }
        model.addAttribute("name", name);
        return "index";
    }


    @RequestMapping("/action-history")
    public String history() {
        return "action-history";
    }

}
