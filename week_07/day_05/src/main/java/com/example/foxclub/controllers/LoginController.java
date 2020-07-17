package com.example.foxclub.controllers;

import com.example.foxclub.model.*;
import com.example.foxclub.repositories.FoxRepository;
import com.example.foxclub.repositories.UserRepository;
import com.example.foxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {
    private UserRepository userRepository;
    private FoxRepository foxRepository;


    public LoginController(UserRepository userRepository, FoxRepository foxRepository) {
        this.userRepository = userRepository;
        this.foxRepository = foxRepository;
    }

    @GetMapping("/login")
    public String login(@RequestParam(defaultValue = "") String userName, Model model) {
        model.addAttribute("userName", userName);
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User formUser) {
        Optional<User> optionalUser = userRepository.findByUserName(formUser.getUserName());
        if (!optionalUser.isPresent()) {
            return "redirect:/register";
        }
        User user = optionalUser.get();
        if (user.getPassword().equals(formUser.getPassword())) {
            String foxName = foxRepository.getFoxNameByOwner(user);
            return "redirect:/?name=" + foxName;
        }

        return "login";
    }
}
