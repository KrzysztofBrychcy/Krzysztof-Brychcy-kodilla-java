package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forum = new ArrayList<>();

    public Forum(){
        forum.add(new ForumUser(1, "Aolek", 'F',1981,1,1,11));
        forum.add(new ForumUser(2, "Bolek", 'M',1984,5,5,2));
        forum.add(new ForumUser(3, "Colek", 'F',1995,2,25,34));
        forum.add(new ForumUser(4, "Dolek", 'M',1991,4,23,101));
        forum.add(new ForumUser(5, "Eolek", 'F',1993,7,18,4));
        forum.add(new ForumUser(6, "Folek", 'M',1987,12,10,0));
        forum.add(new ForumUser(7, "Golek", 'F',1997,11,30,23));
        forum.add(new ForumUser(8, "Holek", 'M',1988,6,17,78));
        forum.add(new ForumUser(9, "Iolek", 'F',1992,10,28,0));
        forum.add(new ForumUser(10, "Jolek", 'M',1981,9,2,9));
        forum.add(new ForumUser(11, "Kolek", 'F',1998,3,7,45));
        forum.add(new ForumUser(12, "Lolek", 'M',1989,11,9,0));
        forum.add(new ForumUser(13, "Molek", 'F',1990,7,7,234));
    }


    public List<ForumUser> getUserList(){
        return new ArrayList<>(forum);
    }

}
