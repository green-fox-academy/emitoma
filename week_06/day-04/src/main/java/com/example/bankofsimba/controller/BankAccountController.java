package com.example.bankofsimba.controller;

import com.example.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

    List<BankAccount> accounts = new ArrayList<>(Arrays.asList(
            new BankAccount("Zordon", 10000, "lion"),
            new BankAccount("Zazu", 3000, "hornbill"),
            new BankAccount("Timon", 500, "meerkat"),
            new BankAccount("Rafiki", 20000, "mandrill")
    ));
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");


    @GetMapping("/show")
    public String show(Model model) {

        model.addAttribute("bankaccount", bankAccount);
        return "index";
    }

    @GetMapping("/enjoy")
//    @ResponseBody
    public String enjoy(Model model) {
        String enjoyString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("enjoy", enjoyString);
        return "enjoy";
    }

    @GetMapping("/allaccount")
    public String allacc(Model model) {

        model.addAttribute("account", accounts);
        model.addAttribute("bankaccount", bankAccount);

        return "accounts";
    }
}
