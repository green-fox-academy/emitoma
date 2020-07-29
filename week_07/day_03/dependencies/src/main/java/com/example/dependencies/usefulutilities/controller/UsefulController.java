package com.example.dependencies.usefulutilities.controller;

import com.example.dependencies.usefulutilities.service.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {

    private UtilityService utilityService;

    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String mainPage() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String coloredPage(Model model) {
        String color = utilityService.randomColor();
        model.addAttribute("color", color);
        return "colored";
    }

    @GetMapping("useful/email")
    public String emailPage(@RequestParam String email,
                            Model model) {
        boolean validEmail = utilityService.validateEmail(email);
        model.addAttribute("email", email);
        model.addAttribute("validEmail", validEmail);

        return "email";
    }

    // ## Caesar encoder/decoder
// - Caesar coding is just shifting every character in the text with a specific number of amount in the alphabet, coded `example` with `1` is `fybnqmf`._
// - Have two endpoints (one for encoding and one for decoding) with a `text` and `number` query param
// - Have a link at the main page for both
// - For encoding use the `number` value, for decoding use the `-number` value when calling the caesar() method.
//     - As a rule of usage: you cannot give negative value for the 'number' query param

    @RequestMapping("/useful/encode")
    public String encode(@RequestParam String text,
                         @RequestParam int number,
                         Model model) {

        String encodedText = utilityService.caesar(text, number);
        model.addAttribute("encodedText", encodedText);
        model.addAttribute("encode", "encode");
        return "ceasar";
    }

    @RequestMapping("/useful/decode")
    public String decode(@RequestParam String text,
                         @RequestParam int number,
                         Model model) {
        String decodedText = utilityService.caesar(text, -number);
        model.addAttribute("decodedText", decodedText);
        model.addAttribute("decode", "decode");
        return "ceasar";
    }
}

