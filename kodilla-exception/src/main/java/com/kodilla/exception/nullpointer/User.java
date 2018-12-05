package com.kodilla.exception.nullpointer;

public class User {
    private String UserName;

    public User(String userName) {
        UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }
}
