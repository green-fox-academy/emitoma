package com.example.redditproject.controllers;

import com.example.redditproject.model.Post;
import com.example.redditproject.model.User;
import com.example.redditproject.repositories.PostRepository;
import com.example.redditproject.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class PostController {
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostController(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/submit")
    public String submitPost(@RequestParam(value = "userName") String userName, Model model) {
        model.addAttribute("userName", userName);
        return "submit";
    }

    @PostMapping("/submit")
    public String submitPost(@RequestParam String title,
                             @RequestParam String url,
                             @RequestParam String userName) {
        Optional<User> optionalUser = userRepository.findByUserName(userName);
        optionalUser.ifPresent(user -> postRepository.save(new Post(title, url, user)));

        return "redirect:/list?userName=" + userName;
    }

    @GetMapping("/list")
    public String list() {
        return "list-posts";
    }

}
