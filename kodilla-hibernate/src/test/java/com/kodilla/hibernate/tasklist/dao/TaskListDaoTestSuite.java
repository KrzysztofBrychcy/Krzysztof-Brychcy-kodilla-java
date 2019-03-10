package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
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
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;
    private static final String LISTNAME = "ListToDO";
    private static final String DESCRIPTION = "Find a calm dark place";

    @Test
    public void testFindByListName() {
        //Give
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, readTaskList.size());
        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.delete(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Give
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some enteties", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo Tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        Assert.assertNotEquals(0,id);
        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public void testNamedQueries() {
        //Give
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Make some test", 13);

        TaskFinancialDetails tf1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tf2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tf3 = new TaskFinancialDetails(new BigDecimal(15), false);
        TaskFinancialDetails tf4 = new TaskFinancialDetails(new BigDecimal(20), false);

        task1.setTaskFinancialDetails(tf1);
        task2.setTaskFinancialDetails(tf2);
        task3.setTaskFinancialDetails(tf3);
        task4.setTaskFinancialDetails(tf4);

        TaskList taskList = new TaskList(LISTNAME,"ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();
        //When
        List<Task> longTask = taskDao.retrieveLongTasks();
        List<Task> shortTask = taskDao.retrieveShortTasks();
//        List<Task> enoughTime = taskDao.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThanTasks = taskDao.retrieveTasksWithDurationLongerThan(6);
        //Then
        try {
            Assert.assertEquals(1, longTask.size());
            Assert.assertEquals(3, shortTask.size());
//            Assert.assertEquals(3, enoughTime.size());
            Assert.assertEquals(2,durationLongerThanTasks.size());
        } finally {
            //CleanUp
            taskListDao.delete(id);
        }
    }

}
