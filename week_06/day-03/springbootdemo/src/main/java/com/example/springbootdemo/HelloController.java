package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    @RequestMapping("/hello") // creating an endpoint
//    @ResponseBody // what we return should be sent in the response body
//    public String sayHello() {
//        return "Hello World"; // what we want to say to the user sending a GET request to this endpoint
//    }

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping("/")
    @ResponseBody
    public String sayHTML(){
        return "<h1>Hello World but in bigger.<h1>";
    }
}
