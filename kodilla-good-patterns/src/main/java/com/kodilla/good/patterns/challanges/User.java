package com.kodilla.good.patterns.challanges;

public class User {
    final private String UserName;
    final private String UserSurname;
    final private int phoneNumber;

    public User(String userName, String userSurname, int phoneNumber) {
        UserName = userName;
        UserSurname = userSurname;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserSurname() {
        return UserSurname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
