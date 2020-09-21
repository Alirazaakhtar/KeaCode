package com.example.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String input() {
        return "input";
    }

    @GetMapping("/Faisal")
    public String index() {
        return "index";

    }

    @GetMapping("/Ali")
    public String ali() {
        return "Alisside";
    }

}
