package com.example.redditproject.controllers;

import com.example.redditproject.model.User;
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
public class LoginController {
    private UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/login")
    public String login(@RequestParam(defaultValue = "") String userName,
                        @RequestParam(defaultValue = "true") boolean passwordOk,
                        Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("passwordOk", passwordOk);
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String userName, @RequestParam String password) {
        Optional<User> optionalUser = userRepository.findByUserName(userName);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (!user.getPassword().equals(password)) {
                return "redirect:/login?passwordOk=false&userName=" + userName;
            }

            return "redirect:/list?userName=" + userName;
        }
        return "redirect:/register?userName=" + userName + "&userFound=false";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }


}
