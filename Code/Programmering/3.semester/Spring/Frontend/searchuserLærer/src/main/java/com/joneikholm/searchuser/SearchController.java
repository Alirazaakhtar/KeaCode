package com.joneikholm.searchuser;

import com.joneikholm.searchuser.model.User;
import com.joneikholm.searchuser.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {
    private UserService userService = new UserService();
    @PostMapping("api/search")
    public ResponseEntity<Result> getSearchResult(@RequestBody AJAXrequest req){
        System.out.println("api/search kaldet med " + req.username);
        Result result = new Result();
        List<User> usersFound = userService.findUsers(req.username);
        result.setUserList(usersFound);
        result.setMessage("antal brugere fundet: " + usersFound.size());
        return ResponseEntity.ok(result);
    }
}
