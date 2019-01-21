package com.kodilla.hibernate2.task.dao;

import com.kodilla.hibernate2.task.Task2;
import com.kodilla.hibernate2.task.TaskFinancialDetails2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Task2DaoTestSuite {
    @Autowired
    private Task2Dao task2Dao;
    private static final String DESCRIPTION = "Test2: Checking hibernate";

    @Test
    public void testTask2DaoSave() {
        //Give
        Task2 task2 = new Task2(DESCRIPTION, 7);
        //When
        task2Dao.save(task2);
        //Then
        int id = task2.getId();
        Task2 readTask = task2Dao.findOne(id);
        System.out.println(readTask);
        Assert.assertEquals(id, readTask.getId());
        //CleanUp
        task2Dao.delete(id);
    }

    @Test
    public void testTaskDaoFindByDuration() {
        //Give
        Task2 task2 = new Task2(DESCRIPTION, 7);
        task2Dao.save(task2);
        int duration = task2.getDuration();
        //When
        List<Task2> readTasks = task2Dao.findByDuration(duration);
        System.out.println(readTasks);
        //Then
        Assert.assertEquals(1,readTasks.size());
        //CleanUp
        int id = readTasks.get(0).getId();
        task2Dao.delete(id);
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetials() {
        //Give
        Task2 task2 = new Task2(DESCRIPTION, 30);
        task2.setTaskFinancialDetails2(new TaskFinancialDetails2(new BigDecimal(120), false));
        //When
        task2Dao.save(task2);
        int id = task2.getId();
        //Then
        Assert.assertNotEquals(0,id);
        //CleanUp
        task2Dao.delete(id);

    }
}
