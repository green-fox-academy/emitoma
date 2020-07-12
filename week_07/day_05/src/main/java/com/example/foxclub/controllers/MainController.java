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

    @GetMapping("/login")
    public String login(@RequestParam(defaultValue = "Foxy") String name, Model model) {
        System.out.println(name);
        model.addAttribute("trickList", foxService.getTrickList());
        model.addAttribute("foodList", foxService.getFoodList());
        model.addAttribute("drinkList", foxService.getDrinkList());
        return "login";
    }

    @PostMapping("/login")
    public String getMyPet(@RequestParam(value = "name") String name,
                           @RequestParam(value = "trick") Trick trick,
                           @RequestParam Food food,
                           @RequestParam Drink drink,
                           @ModelAttribute Fox fox) {
        Optional<Fox> optionalFox = foxService.findFox(name);
        if (optionalFox.isPresent()) {
            return "redirect:/?name=" + name;
        } else {
            fox.learnTricks(trick);
            foxService.add(fox);
            return "redirect:/?name=" + name;
        }
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

    @RequestMapping("/action-history")
    public String history(){
        return "action-history";
    }

}
