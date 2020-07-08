package com.example.dependencies.colouring.controllers;

import com.example.dependencies.colouring.model.Blue;
import com.example.dependencies.colouring.model.MyColour;
import com.example.dependencies.colouring.model.Pink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ColourController {

    @Autowired
    private Pink pink;

    @Autowired
    private Blue blue;

    @GetMapping("/colour")
    @ResponseBody
    public void getColour() {
        pink.printColor();
        blue.printColor();
    }
}
