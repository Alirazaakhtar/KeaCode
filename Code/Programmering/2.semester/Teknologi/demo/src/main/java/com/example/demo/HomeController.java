package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String input() {
        return "input";


    }

    @GetMapping("/2w")
    public String index() {
        return "index";
    }

    @GetMapping("/3w")
    public String bomb() {
        return "bomb";
    }

}
