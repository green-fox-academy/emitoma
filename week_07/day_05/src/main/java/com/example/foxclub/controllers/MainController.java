package com.example.foxclub.controllers;

import com.example.foxclub.model.Food;
import com.example.foxclub.model.Fox;
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
        }
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String login(@RequestParam(defaultValue = "Foxy") String name, Model model) {

//        Optional<Fox> optionalFox = foxService.findFox(name);
//        if (!optionalFox.isPresent()) {
        model.addAttribute("trickList", foxService.getTrickList());
        model.addAttribute("foodList", foxService.getFoodList());
        model.addAttribute("drinkList", foxService.getDrinkList());
//        }
        return "login";
    }

    @PostMapping("/login")
    public String getMyPet(@RequestParam(value = "name") String name, @ModelAttribute Fox fox) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (optionalFox.isPresent()) {
            return "redirect:/?name=" + name;
        } else {
            foxService.add(fox);
//            return "redirect:/login";
            return "redirect:/?name=" + name;

        }
    }

    @RequestMapping("/nutrition-store")
    public String nutrition() {
        return "nutritionstore";
    }

}
