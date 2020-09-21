package com.example.springsecurity.Controllers;

import com.example.springsecurity.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

@Autowired
    UserService userService;


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/homepage")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String homePage(){
        return "homePage";
    }

    @GetMapping(value = "/logout-success")
    public String getLogoutPage() {
        return "logout";
    }


}
