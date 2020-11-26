package com.example.ajaxjquery;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private ArrayList<User> list = new ArrayList<>();
    private String totalSearch;

    public UserService() {
        createUser();
    }

    public void createUser(){
        list.add(new User("Ali"));
        list.add(new User("Ali"));
        list.add(new User("Anna"));
        list.add(new User("Anna"));
        list.add(new User("Ali"));
        list.add(new User("Omar"));
        list.add(new User("Peter"));
        list.add(new User("Ali"));
        list.add(new User("Ali"));
        list.add(new User("Ali"));
        list.add(new User("Peter"));
        list.add(new User("Ali"));

    }


    public List<User> match(User user){

        List<User> searchFound = new ArrayList<>();
        for (User u: list) {
            if(u.getUsername().startsWith(user.getUsername())){
                searchFound.add(user);
            }
        }

        return searchFound;
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }


    public String getTotalSearch() {
        return totalSearch;
    }

    public void setTotalSearch(String totalSearch) {
        this.totalSearch = totalSearch;
    }
}
