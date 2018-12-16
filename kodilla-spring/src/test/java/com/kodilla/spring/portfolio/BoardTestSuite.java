package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.doneList.addTask("Zadanie1");
        board.inProgressList.addTask("Zadanie2");
        board.toDoList.addTask("Zadanie3");

        //When
        String testDoneList = board.getDoneList().toString();
        String testInProgressList = board.getInProgressList().toString();
        String testtoDoList = board.getToDoList().toString();
        //Then
        Assert.assertEquals("This is a task:[Zadanie1]", testDoneList);
        Assert.assertEquals("This is a task:[Zadanie2]", testInProgressList);
        Assert.assertEquals("This is a task:[Zadanie3]", testtoDoList);

    }
}
