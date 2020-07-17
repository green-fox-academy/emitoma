package com.example.foxclub.controllers;

import com.example.foxclub.model.Fox;
import com.example.foxclub.model.User;
import com.example.foxclub.repositories.FoxRepository;
import com.example.foxclub.repositories.UserRepository;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class RegisterController {
    private UserRepository userRepository;
    private FoxRepository foxRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String register(@RequestParam(defaultValue = "true") boolean passwordOk, Model model) {
        model.addAttribute("passwordOk", passwordOk);
        return "register";
    }

    @PostMapping("/register")
    public String saveReg(@RequestParam String userName, @RequestParam String password, @RequestParam String passwordConfirmation) {
        if (!password.equals(passwordConfirmation)) {
            return "redirect:/register?passwordOk=false";
        }

        Optional<User> optionalUser = userRepository.findByUserName(userName);

        if (!optionalUser.isPresent()) {
            User newUser = new User(userName, password);
            Fox newFox = new Fox();
            newUser.setFox(newFox);
            newFox.setOwner(newUser);
            userRepository.save(newUser);

            return "redirect:/login?userName=" + userName;
        }


        return "redirect:/login?userName=" + userName;
    }
}
