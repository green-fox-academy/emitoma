package com.example.orientationexampleexam.controller;

import com.example.orientationexampleexam.model.Link;
import com.example.orientationexampleexam.model.SecretCode;
import com.example.orientationexampleexam.repository.LinkRepository;
import com.example.orientationexampleexam.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String renderMainPage(@RequestParam(defaultValue = "false") boolean success,
                                 @RequestParam(defaultValue = "", required = false) String alias,
                                 @RequestParam(defaultValue = "") SecretCode secretCode,
                                 Model model) {

        model.addAttribute("success", success);
//        model.addAttribute("error", error);
        model.addAttribute("alias", alias);


        model.addAttribute("secretCode", secretCode.getSecretCode());
        return "index";
    }


    @PostMapping("/save-link")
    public String submitLink(@RequestParam String url,
                             @RequestParam String alias) {
        Optional<Link> databaseLink = linkRepository.findByAlias(alias);
        if (databaseLink.isPresent()) {
            Link link = databaseLink.get();
            return "redirect:/?success=true&alias=" + link.getAlias() + "&secretCode=" + link.getSecretCode();
        }
        return "redirect:/?success=false";


    }

    @GetMapping("/a/{alias}")
    public String aliasexist(@PathVariable String alias) {
        Optional<Link> databaseLink = linkRepository.findByAlias(alias);
        if (databaseLink.isPresent()) {
            String linkUrl = databaseLink.get().getUrl();
            databaseLink.get().incrementHitcount();
            return "redirect:" + linkUrl;
        } else {
            return "/";
        }
    }
}
