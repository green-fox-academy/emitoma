package com.example.foxclub.controllers;

import com.example.foxclub.model.Fox;
import com.example.foxclub.model.Trick;
import com.example.foxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class TrickController {
    private FoxService foxService;

    public TrickController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/trick-center")
    public String showMyTricks(@RequestParam(defaultValue = "Foxy") String name, Model model) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (optionalFox.isPresent()) {
            Fox foundFox = optionalFox.get();
            model.addAttribute("trickList", foxService.getNotLearntTricks(foundFox));

        }
        model.addAttribute("name", name);
        return "trickcenter";
    }

    @PostMapping("/trick-center")
    public String learnTrick(@RequestParam(defaultValue = "Foxy") String name, @RequestParam(defaultValue = "trick") Trick trick, Model model) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (optionalFox.isPresent()) {
            Fox foundFox = optionalFox.get();
            foundFox.learnTricks(trick);
            return "redirect:/?name=" + name;

        }
        return "redirect:/?name=" + name;
    }

}