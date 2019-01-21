package com.kodilla.hibernate2.tasklist.dao;

import com.kodilla.hibernate2.task.Task2;
import com.kodilla.hibernate2.task.TaskFinancialDetails2;
import com.kodilla.hibernate2.tasklist.TaskList2;
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
public class TaskList2DaoTestSuite {
    @Autowired
    private TaskList2Dao taskList2Dao;
    private static final String LISTNAME = "ListToDo";
    private static final String DESCRIPTION = "Hello Darkness";

    @Test
    public void testFindByListName() {
        //Give
        TaskList2 taskList2 = new TaskList2(LISTNAME,DESCRIPTION);
        taskList2Dao.save(taskList2);
        String listName = taskList2.getListName();
        //When
        List<TaskList2> readTaskList = taskList2Dao.findByListName(listName);
        //Then
        Assert.assertEquals(1,readTaskList.size());
        //CleanUp
        int id = readTaskList.get(0).getId();
        taskList2Dao.delete(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Give
        Task2 task = new Task2("Test2: Learn Hibernate", 14);
        Task2 task2 = new Task2("Test2: Write some entities", 3);
        TaskFinancialDetails2 tfd = new TaskFinancialDetails2(new BigDecimal(20), false);
        TaskFinancialDetails2 tfd2 = new TaskFinancialDetails2(new BigDecimal(10), false);
        task.setTaskFinancialDetails2(tfd);
        task2.setTaskFinancialDetails2(tfd2);
        TaskList2 taskList2 = new TaskList2(LISTNAME, "ToDo tasks");
        taskList2.getTask2s().add(task);
        taskList2.getTask2s().add(task2);
        task.setTaskList2(taskList2);
        task2.setTaskList2(taskList2);
        //When
        taskList2Dao.save(taskList2);
        int id = taskList2.getId();
        //Then
        Assert.assertNotEquals(0, id);
        System.out.println(taskList2);
        //CleanUp
        taskList2Dao.delete(id);
    }
}
