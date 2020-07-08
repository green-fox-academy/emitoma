package com.example.dependencies.matreviewwebshop.controller;

import com.example.dependencies.matreviewwebshop.model.Item;
import com.example.dependencies.matreviewwebshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public String getItems(Model model) {
        model.addAttribute("items", itemService.getList());
        return "items";
    }

    @GetMapping("/items2")
    public String getItems2(Model model) {
        model.addAttribute("items", itemService.getList());
        return "items";
    }
}
