package com.example.seachuser;


import com.example.seachuser.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    ArrayList<User> list = new ArrayList<>();

    private UserService userService = new UserService();


    @PostMapping("api/search")
    public ResponseEntity<Result> getSearch(@RequestBody AJAXrequest ajaXrequest) {

//        int total = 0;
//
//        list.add(new User("Ali"));
//        list.add(new User("Ali"));
//        list.add(new User("Ali"));
//        list.add(new User("Ali"));
//        list.add(new User("Jon"));
//        list.add(new User("Ali"));
//        list.add(new User("Jon"));
//        list.add(new User("Ali"));
//        list.add(new User("Omar"));
//        list.add(new User("Ali"));
//        list.add(new User("Jakob"));
//
//        for (User user : list) {
//
//            if(ajaXrequest.username.equals(user.getUsername())){
//                total++;
//            }
//
//        }


        System.out.println("api/search kaldet " + ajaXrequest.username);
        Result result = new Result();

        List<User> usersFound = userService.findUsers(ajaXrequest.username);


        result.setMessage("Total search found: " + usersFound.size());

        return ResponseEntity.ok(result);
    }


}
