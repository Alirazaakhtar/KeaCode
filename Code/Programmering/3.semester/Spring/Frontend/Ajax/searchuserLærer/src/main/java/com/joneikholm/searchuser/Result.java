package com.joneikholm.searchuser;

import com.joneikholm.searchuser.model.User;

import java.util.List;

public class Result {
    private String message;
    private List<User> userList;
    public Result() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
