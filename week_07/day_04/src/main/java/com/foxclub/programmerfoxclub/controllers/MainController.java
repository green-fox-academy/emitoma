package com.foxclub.programmerfoxclub.controllers;


import com.foxclub.programmerfoxclub.model.Fox;
import com.foxclub.programmerfoxclub.service.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class MainController {

    @Autowired
    private FoxList foxList;


    @RequestMapping("/")
    String home(@RequestParam(defaultValue = "Mr.Fox") String name, Model model) {
        System.out.println(name);
        Optional<Fox> optionalFox = foxList.findMyFox(name);
        if (optionalFox.isPresent()) {
            Fox fox = optionalFox.get();
//            model.addAttribute("name", fox.getName());
//            model.addAttribute("food", fox.getFood());
//            model.addAttribute("drink", fox.getDrink());
            model.addAttribute("fox", fox);
        }

        model.addAttribute("foxList", foxList.getFoxList());
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String myPet(@ModelAttribute Fox fox, Model model) {
        if (foxList.contains(fox)) {
            Optional<Fox> optionalFox = foxList.findMyFox(fox.getName());
            if (optionalFox.isPresent()) {
                Fox myFox = optionalFox.get();

                return "redirect:/?name=" + fox.getName();
            }
        } else {
            foxList.add(fox);
            return "redirect:/?name=" + fox.getName();
        }

        return "login";
    }

}
