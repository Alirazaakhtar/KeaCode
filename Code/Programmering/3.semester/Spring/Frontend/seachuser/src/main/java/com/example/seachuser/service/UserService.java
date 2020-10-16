package com.example.seachuser.service;

import com.example.seachuser.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> list = new ArrayList<>();


    public UserService() {
        createUsers();
    }

    public List<User> findUsers(String name){


        List<User> result = new ArrayList<>();
        for (User user: list
             ) {
            if(user.getUsername().startsWith(name)){
                result.add(user);
            }
        }

        return result;
    }

    public void createUsers(){


        list.add(new User("Ali"));
        list.add(new User("Ali"));
        list.add(new User("Ali"));
        list.add(new User("Ali"));
        list.add(new User("Jon"));
        list.add(new User("Ali"));
        list.add(new User("Jon"));
        list.add(new User("Ali"));
        list.add(new User("Omar"));
        list.add(new User("Ali"));
        list.add(new User("Jakob"));

    }

}
