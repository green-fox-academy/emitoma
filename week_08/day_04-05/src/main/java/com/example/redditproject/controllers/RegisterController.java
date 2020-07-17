package com.example.redditproject.controllers;

import com.example.redditproject.model.User;
import com.example.redditproject.repositories.PostRepository;
import com.example.redditproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class RegisterController {
    private final UserRepository userRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String newUser(@RequestParam(defaultValue = "") String firstName,
                          @RequestParam(defaultValue = "") String lastName,
                          @RequestParam(defaultValue = "") String userName,
                          @RequestParam(defaultValue = "true") boolean passwordOk,
                          @RequestParam(defaultValue = "true") boolean userFound, Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("userName", userName);
        model.addAttribute("passwordOk", passwordOk);
        model.addAttribute("userFound", userFound);
        return "register";
    }

    @PostMapping("/register")
    public String newUser(@RequestParam String firstName,
                          @RequestParam String lastName,
                          @RequestParam String userName,
                          @RequestParam String password,
                          @RequestParam String passwordConfirmation) {
        if (!password.equals(passwordConfirmation)) {
            return "redirect:/register?passwordOk=false&firstName=" + firstName + "&lastName="
                    + lastName + "&userName=" + userName;
        }

        Optional<User> optionalUser = userRepository.findByUserName(userName);

        if (!optionalUser.isPresent()) {
            User newUser = new User(firstName, lastName, userName, password);
            userRepository.save(newUser);
            return "redirect:/login?userName=" + userName;
        }
        return "redirect:/login?userName=" + userName;

    }
}
