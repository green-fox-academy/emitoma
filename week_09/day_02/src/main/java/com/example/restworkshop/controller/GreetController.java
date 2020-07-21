package com.example.restworkshop.controller;

import com.example.restworkshop.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController
public class GreetController {

    @GetMapping("/greeter")
    public HashMap<String, String> greeting(@RequestParam(required = false) String name,
                                            @RequestParam(required = false) String title,
                                            HttpServletResponse response) {
        Person person = new Person(name, title);
        if (name == null && title == null) {
            HashMap<String, String> responseData = new HashMap<>();
            responseData.put("error", "Please provide a name and a title!");
            response.setStatus( HttpServletResponse.SC_BAD_REQUEST  );
            return responseData;
//            return ResponseEntity.status(400).body("Please provide a name and a title!");
        } else if (name == null) {
            HashMap<String, String> responseData = new HashMap<>();
            responseData.put("error", "Please provide a name!");
            response.setStatus( HttpServletResponse.SC_BAD_REQUEST  );
            return responseData;
//            return ResponseEntity.status(400).body("Please provide a name!");
        } else if (title == null) {
            HashMap<String, String> responseData = new HashMap<>();
            responseData.put("error", "Please provide a title!");
            response.setStatus( HttpServletResponse.SC_BAD_REQUEST  );
            return responseData;
//            return ResponseEntity.status(400).body("Please provide a title!");
        }
        HashMap<String, String> responseData = new HashMap<>();
        responseData.put("welcome_message", person.welcome());
//        return ResponseEntity.status(200).body(person.welcome());
        return responseData;
    }
 


}
