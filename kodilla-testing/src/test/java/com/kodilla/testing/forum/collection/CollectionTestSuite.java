package com.kodilla.testing.forum.collection;

import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.Assert;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: Begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: End");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: Begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: End");
    }
    @Test
    public void testOddNumberExterminatorEmptyList(){
        //Given
        OddNumberExterminator test1 = new OddNumberExterminator();
        ArrayList<Integer> pusta = new ArrayList<>();
        pusta.clear();
        //When
        ArrayList<Integer> result = new ArrayList<>(test1.exterminate(pusta));
        System.out.println("Testing: Empty List");
        //Then
        Assert.assertEquals(pusta,result);

    }
    @Test
    public void testOddNumberExterminatorNormalList(){
        //Given
        OddNumberExterminator test2 = new OddNumberExterminator();
        ArrayList<Integer> normalna = new ArrayList<>();
        ArrayList<Integer> parzysta = new ArrayList<>();
        normalna.add(-1);
        normalna.add(2);
        parzysta.add(2);
        //When
        ArrayList<Integer> result = new ArrayList<>(test2.exterminate(normalna));
        System.out.println("Testing: Normal List");
        //Then
        Assert.assertEquals(parzysta,result);

    }


}
