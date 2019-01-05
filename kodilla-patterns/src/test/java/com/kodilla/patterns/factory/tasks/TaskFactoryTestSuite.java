package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Give
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        boolean status =  shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Biedronka", shoppingTask.getTaskName());
        Assert.assertTrue(status);
        Assert.assertFalse(shoppingTask.isTaskExecuted());
    }
    @Test
    public void testPaintingTask() {
        //Give
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        boolean status = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Jedynka", paintingTask.getTaskName());
        Assert.assertTrue(status);
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }
    @Test
    public void testDrivingTask() {
        //Give
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        boolean status = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Trip1", drivingTask.getTaskName());
        Assert.assertTrue(status);
        Assert.assertFalse(drivingTask.isTaskExecuted());
    }

}
