package com.emitoma.basicwebshop.controllers;

import com.emitoma.basicwebshop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class ShopController {

    List<Item> items = new ArrayList<>(Arrays.asList(
            new Item("Running Shoes", "Nike running shoes for everyday sport", 1000, 5),
            new Item("Printer", "Some HP pritnter that will print pages", 3000, 3),
            new Item("Coca Cola", "0.5l standard coke", 25, 0),
            new Item("Wokin", "Chicken with fries rice in Wokin sauce", 119, 100),
            new Item("T-Shirt", "Blue with corgi on a bike", 300, 1)
    ));

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/webshop")
    public String home(Model model) {
        model.addAttribute("items", items);
        return "index";
    }

    @RequestMapping("/only-available")
    public String zeroStock(Model model) {
        List<Item> outOfStock = getOutOfStock();
        model.addAttribute("items", outOfStock);
        return "index";
    }

    public List<Item> getOutOfStock() {
        return items.stream()
                .filter(s -> s.getQuantityOfStock() == 0)
                .collect(Collectors.toList());
    }

    @RequestMapping("/cheapest-first")
    public String cheap(Model model) {
        List<Item> sorted = getSorted();
        model.addAttribute("items", sorted);
        return "index";

    }

    public List<Item> getSorted() {
        return items.stream()
                .sorted(Comparator.comparing(Item::getPrice))
                .collect(Collectors.toList());
    }


    @RequestMapping("/contains-nike")
    public String nike(Model model) {
        List<Item> containsNike = getNike();
        model.addAttribute("items", containsNike);
        return "index";
    }

    public List<Item> getNike() {
        return items.stream()
                .filter(i -> i.getDescription().contains("Nike"))
                .collect(Collectors.toList());
    }
}
