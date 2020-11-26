package com.example.ajaxjquery;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {


    UserService userService = new UserService();

    @PostMapping("/search")
    public ResponseEntity<UserService> getSearch(@RequestBody User user) {


        userService.setTotalSearch("Total search found: " + userService.match(user).size());

        return ResponseEntity.ok(userService);
    }

    @PostMapping("/add")
    public ResponseEntity<UserService> addUser(@RequestBody User user){

        userService.getList().add(user);


        return ResponseEntity.ok(userService);
    }

    @PostMapping("/get")
    public ResponseEntity<UserService> getUser(){


        return ResponseEntity.ok(userService);
    }
}
