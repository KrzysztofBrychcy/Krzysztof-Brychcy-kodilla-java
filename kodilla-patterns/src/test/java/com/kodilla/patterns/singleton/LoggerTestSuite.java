package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void addLog() {
        Logger.getInstance().log("This is a last log");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log is ---> [" + lastLog + "]");
        //Then
        Assert.assertEquals("This is a last log", lastLog);
    }
}
