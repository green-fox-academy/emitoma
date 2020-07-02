package com.example.bankofsimba.controller;

import com.example.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.SwitchPoint;
import java.util.*;

@Controller
public class BankAccountController {

    List<BankAccount> accounts = new ArrayList<>(Arrays.asList(
            new BankAccount("Scar", 10000, "lion", false, true),
            new BankAccount("Zazu", 3000, "hornbill", false, false),
            new BankAccount("Timon", 500, "meerkat", false, false),
            new BankAccount("Rafiki", 20000, "mandrill", false, false),
            new BankAccount("Simba", 2000, "lion", true, false)
    ));
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");


    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("bankaccount", bankAccount);
        return "index";
    }

    @GetMapping("/html")
//    @ResponseBody
    public String enjoy(Model model) {
        String enjoyString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("enjoy", enjoyString);
        return "enjoy";
    }

    @GetMapping("/account")
    public String allAccounts(Model model) {

        model.addAttribute("accounts", accounts);

        return "accounts";
    }

    @PostMapping("/save-account")
    public String saveAcc(@ModelAttribute BankAccount bankAccount) {
        accounts.add(bankAccount);

        return "redirect:/account";
    }

    @GetMapping("/increase-balance")
    public String increaseBalance(@RequestParam String name, Model model) {
        Optional<BankAccount> optionalBankAccount = findAccount(name);

        if (optionalBankAccount.isPresent()) {
            BankAccount bankAccount = optionalBankAccount.get();
            bankAccount.incrementBalance();

        }

        return "redirect:/account";
    }

    private Optional<BankAccount> findAccount(String name) {
        return accounts.stream()
                .filter(a -> a.getName().equals(name))
                .findFirst();
    }

}
