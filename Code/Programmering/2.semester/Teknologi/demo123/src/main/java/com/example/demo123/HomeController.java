package com.example.demo123;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String HomePage(){
        return "HomePage";

    }

    @GetMapping("/Ali")
    public String secondPage(){
        return "SecondPage";
    }

    @GetMapping("/Alice")
    public String ThirdPage(){
        return "Alice";
    }


}
