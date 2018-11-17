package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

//Test Suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest(){
        testCounter ++;
        System.out.println("Prepering the execute test #" +testCounter);
    }

    @Test
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("Krysek","Krzysztof");
        //When
        forumUser.addPost("Krysek","Hi, this is my first post");
        //Then
        Assert.assertEquals(1,forumUser.getPostsQuantity());

    }
    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("Krysek","Krzysztof");
        ForumPost thePost = new ForumPost("Hi everyone" + "this is my first post","Krysek");
        //When
        forumUser.addComment(thePost, "Krysek","Thank you!");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());

    }
    @Test
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("Krysek","Krzysztof");
        ForumPost thePost = new ForumPost("Hi everyone" + "this is my first post","Krysek");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost,retrievedPost);

    }
    @Test
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("Krysek","Krzysztof");
        ForumPost thePost = new ForumPost("Hi everyone" + "this is my first post","Krysek");
        ForumComment theComment = new ForumComment(thePost,"Thank you!","Krysek");
        forumUser.addComment(thePost,theComment.getAuthor(),theComment.getCommentBody());
        //When
        ForumComment retrivedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrivedComment);

    }
    @Test
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("Krysek","Krzysztof");
        ForumPost thePost = new ForumPost("Hi everyone" + "this is my first post","Krysek");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);

    }
    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("Krysek","Krzysztof");
        ForumPost thePost = new ForumPost("Hi everyone" + "this is my first post","Krysek");
        ForumComment theComment = new ForumComment(thePost,"Thank you!","Krysek");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);

    }
    @Test
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("Krysek","Krzysztof");
        ForumPost thePost = new ForumPost("Hi everyone" + "this is my first post","Krysek");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getPostsQuantity());


    }
    @Test
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("Krysek","Krzysztof");
        ForumPost thePost = new ForumPost("Hi everyone" + "This is my first post","Krysek");
        ForumComment theComment = new ForumComment(thePost,"Thank you!","Krysek");
        forumUser.addComment(thePost,theComment.getAuthor(),theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getCommentsQuantity());
    }
}
