package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

public class BoradTestSuite {
    public Board prepareTestData(){
        //users
        User user1 = new User("developer1","John Smith");
        User user2 = new User("projectmanager1","Nina White");
        User user3 = new User("developer2","Emilia Stephanson");
        User user4 = new User("developer3","Konrad Bridge");
        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));
        //taskLists
        TaskList taskListToDo = new TaskList("To Do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgres = new TaskList("In progress");
        taskListInProgres.addTask(task5);
        taskListInProgres.addTask(task4);
        taskListInProgres.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);
        //board
        Board project = new Board("Project Weather Prediciotn");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgres);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    public void testAddTaskList(){
        //Given
        Board project = prepareTestData();
        //When
        //Then
        Assert.assertEquals(3,project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListFindUserTasks(){
        //Given
        Board project = prepareTestData();
        //When
        User user = new User("developer1","John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(toList());
        //Then
        Assert.assertEquals(2,tasks.size());
        Assert.assertEquals(user, tasks.get(0).getAssignedUser());
        Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }

    @Test
    public void testAddTaskListFindOutdatedTasks(){
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("ToDo"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(l -> l.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());
        //Then
        Assert.assertEquals(1, tasks.size());
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }

    @Test
    public void testAddTaskListFindLongTasks(){
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(t -> t.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();
        //Then
        Assert.assertEquals(2,longTasks);
    }

    @Test
    public void testAddTaskListAverageWorkingOnTask(){
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> inProgres = new ArrayList<>();
        inProgres.add(new TaskList("In progress"));
        long sumOfDays = project.getTaskLists().stream()
                .filter(inProgres::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .mapToLong(t -> ChronoUnit.DAYS.between(t.getCreated(),LocalDate.now()))
                .sum();
        long sumOfTasks = project.getTaskLists().stream()
                .filter(inProgres::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(t -> 1)
                .count();
        double averageWorkingOnTasks2 = project.getTaskLists().stream()
                .filter(inProgres::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .mapToDouble(t -> ChronoUnit.DAYS.between(t.getCreated(),LocalDate.now()))
                .average().getAsDouble();
        //Then
        double averageWorkingOnTasks = sumOfDays / sumOfTasks;
        Assert.assertEquals(10,averageWorkingOnTasks,0);
        Assert.assertEquals(10,averageWorkingOnTasks2,0);
    }

}