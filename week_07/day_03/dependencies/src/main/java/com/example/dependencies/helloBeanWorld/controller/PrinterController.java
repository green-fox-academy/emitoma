package com.example.dependencies.helloBeanWorld.controller;

import com.example.dependencies.helloBeanWorld.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrinterController {
    @Autowired
    private Printer printer;

//    public PrinterController(Printer printer) {
//        this.printer = printer;
//    }

    @GetMapping("/")
    @ResponseBody
    public void getLog() {
        String string = "hello";
        printer.log(string);
    }

}
