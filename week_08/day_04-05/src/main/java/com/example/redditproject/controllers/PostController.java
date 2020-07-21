package com.example.redditproject.controllers;

import com.example.redditproject.model.Post;
import com.example.redditproject.model.User;
import com.example.redditproject.repositories.PostRepository;
import com.example.redditproject.repositories.UserRepository;
import com.example.redditproject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class PostController {
    private final PostRepository postRepository;
    private final UserRepository userRepository;
    private PostService postService;

    @Autowired
    public PostController(PostRepository postRepository, UserRepository userRepository, PostService postService) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.postService = postService;
    }

    @GetMapping("/submit")
    public String submitPost(@RequestParam(value = "userName") String userName, Model model) {
        System.out.println(userName);
        model.addAttribute("userName", userName);
        return "submit";
    }

    @PostMapping("/submit")
    public String submitPost(@RequestParam String title,
                             @RequestParam String postBody,
                             @RequestParam(value = "userName") String userName) {
        postService.savePost(userName,title,postBody);

        return "redirect:/list?userName=" + userName;
    }

    @GetMapping("/list")
    public String list(@RequestParam(value = "userName") String userName,
                       Model model) {

         model.addAttribute("posts", postRepository.findAll());
        model.addAttribute("userName", userName);

        return "list-posts";
    }

}
