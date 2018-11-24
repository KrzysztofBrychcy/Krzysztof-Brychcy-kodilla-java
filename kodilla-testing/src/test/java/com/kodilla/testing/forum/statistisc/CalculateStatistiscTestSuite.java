package com.kodilla.testing.forum.statistisc;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatistiscTestSuite {
    @Test
    public void testCalculateAdvStatistic_MyTest(){
        //Given
        Statistisc statistiscMock = mock(Statistisc.class);
        int postCountTest = 1;
        int commentCountTest = 1;
        ArrayList<String> usersNamesTest = new ArrayList<String>();
        for (int i = 0; i < 1; i++){
            usersNamesTest.add("Name" + i);
        }
        when(statistiscMock.postCount()).thenReturn(postCountTest);
        when(statistiscMock.commentsCount()).thenReturn(commentCountTest);
        when(statistiscMock.usersNames()).thenReturn(usersNamesTest);

        CalculateStatistisc calculateStatistisc = new CalculateStatistisc(statistiscMock);
        calculateStatistisc.calculateAdvStatistic(statistiscMock);
        //When
        double postsOnUser = calculateStatistisc.getPostsOnUsers();
        double commentsOnUser = calculateStatistisc.getCommentsOnUsers();
        double commentsOnPosts = calculateStatistisc.getCommentsOnPosts();
        //Then
        Assert.assertEquals(1,postsOnUser,0);
        Assert.assertEquals(1,commentsOnUser,0);
        Assert.assertEquals(1,commentsOnPosts,0);
    }
    @Test
    public void testCalculateAdvStatistic_ZeroPosts(){
        //Given
        Statistisc statistiscMock = mock(Statistisc.class);
        int postCountTest = 0;
        int commentCountTest = 1;
        ArrayList<String> usersNamesTest = new ArrayList<String>();
        for (int i = 0; i < 1; i++){
            usersNamesTest.add("Name" + i);
        }
        when(statistiscMock.postCount()).thenReturn(postCountTest);
        when(statistiscMock.commentsCount()).thenReturn(commentCountTest);
        when(statistiscMock.usersNames()).thenReturn(usersNamesTest);

        CalculateStatistisc calculateStatistisc = new CalculateStatistisc(statistiscMock);
        calculateStatistisc.calculateAdvStatistic(statistiscMock);
        //When
        double postsOnUser = calculateStatistisc.getPostsOnUsers();
        double commentsOnUser = calculateStatistisc.getCommentsOnUsers();
        double commentsOnPosts = calculateStatistisc.getCommentsOnPosts();
        //Then
        Assert.assertEquals(0,postsOnUser,0);
        Assert.assertEquals(1,commentsOnUser,0);
        Assert.assertEquals(Infinity,commentsOnPosts,0);
    }
    @Test
    public void testCalculateAdvStatistic_ThausendPosts(){
        //Given
        Statistisc statistiscMock = mock(Statistisc.class);
        int postCountTest = 1000;
        int commentCountTest = 1;
        ArrayList<String> usersNamesTest = new ArrayList<String>();
        for (int i = 0; i < 1; i++){
            usersNamesTest.add("Name" + i);
        }
        when(statistiscMock.postCount()).thenReturn(postCountTest);
        when(statistiscMock.commentsCount()).thenReturn(commentCountTest);
        when(statistiscMock.usersNames()).thenReturn(usersNamesTest);

        CalculateStatistisc calculateStatistisc = new CalculateStatistisc(statistiscMock);
        calculateStatistisc.calculateAdvStatistic(statistiscMock);
        //When
        double postsOnUser = calculateStatistisc.getPostsOnUsers();
        double commentsOnUser = calculateStatistisc.getCommentsOnUsers();
        double commentsOnPosts = calculateStatistisc.getCommentsOnPosts();
        //Then
        Assert.assertEquals(1000,postsOnUser,0);
        Assert.assertEquals(1,commentsOnUser,0);
        Assert.assertEquals(0.001,commentsOnPosts,0);
    }
    @Test
    public void testCalculateAdvStatistic_ZeroComments(){
        //Given
        Statistisc statistiscMock = mock(Statistisc.class);
        int postCountTest = 1;
        int commentCountTest = 0;
        ArrayList<String> usersNamesTest = new ArrayList<String>();
        for (int i = 0; i < 1; i++){
            usersNamesTest.add("Name" + i);
        }
        when(statistiscMock.postCount()).thenReturn(postCountTest);
        when(statistiscMock.commentsCount()).thenReturn(commentCountTest);
        when(statistiscMock.usersNames()).thenReturn(usersNamesTest);

        CalculateStatistisc calculateStatistisc = new CalculateStatistisc(statistiscMock);
        calculateStatistisc.calculateAdvStatistic(statistiscMock);
        //When
        double postsOnUser = calculateStatistisc.getPostsOnUsers();
        double commentsOnUser = calculateStatistisc.getCommentsOnUsers();
        double commentsOnPosts = calculateStatistisc.getCommentsOnPosts();
        //Then
        Assert.assertEquals(1,postsOnUser,0);
        Assert.assertEquals(0,commentsOnUser,0);
        Assert.assertEquals(0,commentsOnPosts,0);
    }
    @Test
    public void testCalculateAdvStatistic_PostsMoreThenComments(){
        //Given
        Statistisc statistiscMock = mock(Statistisc.class);
        int postCountTest = 2;
        int commentCountTest = 1;
        ArrayList<String> usersNamesTest = new ArrayList<String>();
        for (int i = 0; i < 1; i++){
            usersNamesTest.add("Name" + i);
        }
        when(statistiscMock.postCount()).thenReturn(postCountTest);
        when(statistiscMock.commentsCount()).thenReturn(commentCountTest);
        when(statistiscMock.usersNames()).thenReturn(usersNamesTest);

        CalculateStatistisc calculateStatistisc = new CalculateStatistisc(statistiscMock);
        calculateStatistisc.calculateAdvStatistic(statistiscMock);
        //When
        double postsOnUser = calculateStatistisc.getPostsOnUsers();
        double commentsOnUser = calculateStatistisc.getCommentsOnUsers();
        double commentsOnPosts = calculateStatistisc.getCommentsOnPosts();
        //Then
        Assert.assertEquals(2,postsOnUser,0);
        Assert.assertEquals(1,commentsOnUser,0);
        Assert.assertEquals(0.5,commentsOnPosts,0);
    }
    @Test
    public void testCalculateAdvStatistic_CommentsMoreThenPosts(){
        //Given
        Statistisc statistiscMock = mock(Statistisc.class);
        int postCountTest = 1;
        int commentCountTest = 2;
        ArrayList<String> usersNamesTest = new ArrayList<String>();
        for (int i = 0; i < 1; i++){
            usersNamesTest.add("Name" + i);
        }
        when(statistiscMock.postCount()).thenReturn(postCountTest);
        when(statistiscMock.commentsCount()).thenReturn(commentCountTest);
        when(statistiscMock.usersNames()).thenReturn(usersNamesTest);

        CalculateStatistisc calculateStatistisc = new CalculateStatistisc(statistiscMock);
        calculateStatistisc.calculateAdvStatistic(statistiscMock);
        //When
        double postsOnUser = calculateStatistisc.getPostsOnUsers();
        double commentsOnUser = calculateStatistisc.getCommentsOnUsers();
        double commentsOnPosts = calculateStatistisc.getCommentsOnPosts();
        //Then
        Assert.assertEquals(1,postsOnUser,0);
        Assert.assertEquals(2,commentsOnUser,0);
        Assert.assertEquals(2,commentsOnPosts,0);
    }
    @Test
    public void testCalculateAdvStatistic_ZeroUsers(){
        //Given
        Statistisc statistiscMock = mock(Statistisc.class);
        int postCountTest = 1;
        int commentCountTest = 1;
        ArrayList<String> usersNamesTest = new ArrayList<String>();
        for (int i = 0; i < 0; i++){
            usersNamesTest.add("Name" + i);
        }
        when(statistiscMock.postCount()).thenReturn(postCountTest);
        when(statistiscMock.commentsCount()).thenReturn(commentCountTest);
        when(statistiscMock.usersNames()).thenReturn(usersNamesTest);

        CalculateStatistisc calculateStatistisc = new CalculateStatistisc(statistiscMock);
        calculateStatistisc.calculateAdvStatistic(statistiscMock);
        //When
        double postsOnUser = calculateStatistisc.getPostsOnUsers();
        double commentsOnUser = calculateStatistisc.getCommentsOnUsers();
        double commentsOnPosts = calculateStatistisc.getCommentsOnPosts();
        //Then
        Assert.assertEquals(Infinity,postsOnUser,0);
        Assert.assertEquals(Infinity,commentsOnUser,0);
        Assert.assertEquals(1,commentsOnPosts,0);
    }
    @Test
    public void testCalculateAdvStatistic_HoundredUsers(){
        //Given
        Statistisc statistiscMock = mock(Statistisc.class);
        int postCountTest = 1;
        int commentCountTest = 1;
        ArrayList<String> usersNamesTest = new ArrayList<String>();
        for (int i = 0; i < 100; i++){
            usersNamesTest.add("Name" + i);
        }
        when(statistiscMock.postCount()).thenReturn(postCountTest);
        when(statistiscMock.commentsCount()).thenReturn(commentCountTest);
        when(statistiscMock.usersNames()).thenReturn(usersNamesTest);


        CalculateStatistisc calculateStatistisc = new CalculateStatistisc(statistiscMock);
        calculateStatistisc.calculateAdvStatistic(statistiscMock);
        //When
        double postsOnUser = calculateStatistisc.getPostsOnUsers();
        double commentsOnUser = calculateStatistisc.getCommentsOnUsers();
        double commentsOnPosts = calculateStatistisc.getCommentsOnPosts();
        //Then
        Assert.assertEquals(0.01,postsOnUser,0);
        Assert.assertEquals(0.01,commentsOnUser,0);
        Assert.assertEquals(1,commentsOnPosts,0);
    }
}
