package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/Actors")
    public String actors() {
        return "Actors";
    }

    @GetMapping("/music")
    public String music() {
        return "music";
    }

}
