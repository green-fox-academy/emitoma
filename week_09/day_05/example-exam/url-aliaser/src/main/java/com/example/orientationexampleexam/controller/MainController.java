package com.example.orientationexampleexam.controller;

import com.example.orientationexampleexam.model.Link;
import com.example.orientationexampleexam.model.SecretCode;
import com.example.orientationexampleexam.repository.LinkRepository;
import com.example.orientationexampleexam.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class MainController {
    private LinkService linkService;
    private LinkRepository linkRepository;

    @Autowired
    public MainController(LinkService linkService, LinkRepository linkRepository) {
        this.linkService = linkService;
        this.linkRepository = linkRepository;
    }


    @GetMapping("/")
    public String renderMainPage(@RequestParam(defaultValue = "true") boolean success,
                                 @RequestParam String alias,
                                 @RequestParam SecretCode secretCode,
                                 Model model) {
        model.addAttribute("success", success);
        model.addAttribute("alias", alias);
        model.addAttribute("secretCode", secretCode);
        return "index";
    }


    @PostMapping("/save-link")
    public String submitLink(@RequestParam String url, @RequestParam String alias) {
        Optional<Link> databaseLink = linkService.findLinkInDb(url);
        if (databaseLink.isPresent()) {
            return "redirect:/success=true&secretCode=" + databaseLink.get().getSecretCode();
        }
        Link newLink = linkService.saveNewLink(url, alias);
        return "redirect:/";
    }
}
