package com.emitoma.basicwebshop.controllers;

import com.emitoma.basicwebshop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

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
                .filter(s -> s.getQuantityOfStock() > 0)
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

    @RequestMapping("/average-stock")
    public String average(Model model) {
        OptionalDouble opAverage = getAverage();
        double average = opAverage.orElse(1);
        String averageString = "Average stock: " + average;
        model.addAttribute("statistic", averageString);
        return "statistic";
    }

    public OptionalDouble getAverage() {
        return items.stream()
                .mapToInt(Item::getQuantityOfStock)
                .average();
    }

    @RequestMapping("/most-expensive")
    public String expensive(Model model) {
        Optional<Item> optionalItem = getExpensive();
        if (optionalItem.isPresent()) {
            Item expItem = optionalItem.get();

            String name = "The most expensive item is: " + expItem.getName();
            model.addAttribute("statistic", name);
        }


        return "statistic";
    }

    public Optional<Item> getExpensive() {
        return items.stream()
                .sorted(Comparator.comparing(Item::getPrice).reversed())
                .findFirst();
    }

    @PostMapping("/search")
    public String searchItem(@RequestParam(value = "search") String searchValue, Model model) {
        List<Item> searchResult = findItem(searchValue);
        model.addAttribute("items", searchResult);
        return "index";
    }

    public List<Item> findItem(String searchValue) {
        return items.stream()
                .filter(item -> item.getDescription().toLowerCase().contains(searchValue.toLowerCase()) || item.getName().toLowerCase().contains(searchValue.toLowerCase()))
                        .collect(Collectors.toList());

    }
}








