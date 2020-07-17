package com.example.foxclub.controllers;

import com.example.foxclub.model.Drink;
import com.example.foxclub.model.Food;
import com.example.foxclub.model.Fox;
import com.example.foxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class NutritionController {
    private FoxService foxService;

    public NutritionController(FoxService foxService) {
        this.foxService = foxService;
    }
    @GetMapping("/nutrition-store")
    public String nutrition(@RequestParam(value = "name") String name, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("foodList", foxService.getFoodList());
        model.addAttribute("drinkList", foxService.getDrinkList());

        return "nutritionstore";
    }

    @PostMapping("/nutrition-store")
    public String updateNutrition(@RequestParam(value = "name") String name,
                                  @RequestParam(value = "drink") Drink drink,
                                  @RequestParam(value = "food") Food food, Model model) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (optionalFox.isPresent()) {
            Fox foundFox = optionalFox.get();
            foundFox.setDrink(drink);
            foundFox.setFood(food);
            return "redirect:/?name=" + name;

        }
        return "redirect:/?name=" + name;
    }
}
