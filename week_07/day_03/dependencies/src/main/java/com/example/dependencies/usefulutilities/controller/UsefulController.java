package com.example.dependencies.usefulutilities.controller;

import com.example.dependencies.usefulutilities.service.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulController {

    private UtilityService utilityService;

    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String mainPage() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String coloredPage(Model model) {
        String color = utilityService.randomColor();
        model.addAttribute("color", color);
        return "colored";
    }

}
