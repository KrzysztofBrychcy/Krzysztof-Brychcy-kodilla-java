package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

import static com.kodilla.stream.array.ArrayOperations.getAvarage;

public class ArrayOperationTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[20];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 1;
        }

        //When
        double expectedAverage = ArrayOperations.getAvarage(numbers);

        //Then
        Assert.assertEquals(1,expectedAverage,0);

    }
}
