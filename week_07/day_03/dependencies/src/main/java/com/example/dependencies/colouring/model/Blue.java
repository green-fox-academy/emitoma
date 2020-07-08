package com.example.dependencies.colouring.model;

import com.example.dependencies.helloBeanWorld.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Blue implements MyColour {
    @Autowired
    private Printer printer;

    @Override
    public void printColor() {
        printer.log("It is blue in color");
    }
}
