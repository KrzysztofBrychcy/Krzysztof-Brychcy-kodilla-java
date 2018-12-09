package com.kodilla.spring.forum;

import com.kodilla.spring.SpringRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testGetUserName(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser testForumUser = context.getBean(ForumUser.class);
        //When
        String name = testForumUser.getUserName();
        //Then
        Assert.assertEquals("Jacek Smyf", name);
    }
}
