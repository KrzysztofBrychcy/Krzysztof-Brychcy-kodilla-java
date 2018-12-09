package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String userName;

    public ForumUser() {
        this.userName = "Jacek Smyf";
    }

    public String getUserName() {
        return userName;
    }
}
