package com.emitoma.basicwebshop.controllers;

import com.emitoma.basicwebshop.model.Currency;
import com.emitoma.basicwebshop.model.Filter;
import com.emitoma.basicwebshop.model.Item;
import com.emitoma.basicwebshop.model.ItemType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class ShopController {

    List<Item> items = new ArrayList<>(Arrays.asList(
            new Item("Running Shoes", ItemType.CLOTHES, "Nike running shoes for everyday sport", 1000, Currency.HUF, 5),
            new Item("Printer", ItemType.ELECTRONICS, "Some HP pritnter that will print pages", 3000, Currency.HUF, 2),
            new Item("Coca Cola", ItemType.FOOD, "0.5l standard coke", 25, Currency.HUF, 0),
            new Item("Wokin", ItemType.FOOD, "Chicken with fries rice in Wokin sauce", 119, Currency.HUF, 100),
            new Item("T-Shirt", ItemType.CLOTHES, "Blue with corgi on a bike", 300, Currency.HUF, 1)
    ));
    List<Filter> filters = new ArrayList<>(Arrays.asList(
            new Filter(ItemType.CLOTHES, "clothes", "Clothes and Shoes"),
            new Filter(ItemType.ELECTRONICS, "electronics", "Electronics"),
            new Filter(ItemType.FOOD, "food", "Beverages and Snacks")
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
        if (outOfStock.isEmpty()) {
            model.addAttribute("statistic", "No items to show.");
        }
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
        if (sorted.isEmpty()) {
            model.addAttribute("statistic", "No items to show.");
        }
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
        if (containsNike.isEmpty()) {
            model.addAttribute("statistic", "No items to show.");
        }

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
        } else {

            model.addAttribute("statistic", "No items to show.");
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


    @GetMapping("/more-filters")
    public String morefilters(Model model) {
        model.addAttribute("filters", filters);
        model.addAttribute("items", items);
        return "more";
    }

    @GetMapping("/filter-by-type/{shortName}")
    public String typeFilter(@PathVariable String shortName, Model model) {

        Optional<Filter> optionalFilter = filters.stream()
                .filter(filter -> filter.getShortName().equals(shortName))
                .findFirst();

        List<Item> filteredItems;

        if (optionalFilter.isPresent()) {
            filteredItems = typeFilter(optionalFilter.get().getType());
        } else {
            filteredItems = new ArrayList<>();
        }


        model.addAttribute("filters", filters);
        model.addAttribute("items", filteredItems);


        return "more";
    }

    public List<Item> typeFilter(ItemType type) {
        return items.stream()
                .filter(item -> item.getType().equals(type))
                .collect(Collectors.toList());
    }

    @GetMapping("/price-in-eur")
    public String changeCurrency(Model model) {
        Item.setCurrentCurrency(Currency.EUR);

        model.addAttribute("filters", filters);
        model.addAttribute("items", items);

        return "more";
    }

    @GetMapping("/price-in-original")
    public String changeBackCurrency(Model model) {
        Item.setCurrentCurrency(Currency.HUF);

        model.addAttribute("filters", filters);
        model.addAttribute("items", items);

        return "more";
    }

    @PostMapping("/filter-by-price")
    public String filterByPrice(@RequestParam(value = "filter") int searchValue,
                                @RequestParam(value = "filter-type") String filterType, Model model) {

        List<Item> filteredItems = priceFilter(searchValue, filterType);
        model.addAttribute("items", filteredItems);
        model.addAttribute("filters", filters);


        return "more";
    }

    public List<Item> priceFilter(int searchValue, String filterType) {
        List<Item> filteredItems = new ArrayList<>();
        if (filterType.equals("above")) {
            filteredItems = items.stream().filter(item -> item.getPrice() > searchValue)
                    .collect(Collectors.toList());
        } else if (filterType.equals("below")) {
            filteredItems = items.stream().filter(item -> item.getPrice() < searchValue)
                    .collect(Collectors.toList());
        } else if (filterType.equals("exactly")) {
            filteredItems = items.stream().filter(item -> item.getPrice() == searchValue)
                    .collect(Collectors.toList());
        }
        return filteredItems;
    }

}









