package com.kodilla.hibernate2.tasklist;

import com.kodilla.hibernate2.task.Task2;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLIST2")
public class TaskList2 {
    private int id;
    private String listName;
    private String description;
    private List<Task2> task2s = new ArrayList<>();

    public TaskList2() {
    }

    public TaskList2(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    @OneToMany(
            targetEntity = Task2.class,
            mappedBy = "taskList2",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Task2> getTask2s() {
        return task2s;
    }


    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setTask2s(List<Task2> task2s) {
        this.task2s = task2s;
    }

    @Override
    public String toString() {
        return "TaskList2{" +
                "id=" + id +
                ", listName='" + listName + '\'' +
                ", description='" + description + '\'' +
                ", task2s=" + task2s +
                '}';
    }
}
