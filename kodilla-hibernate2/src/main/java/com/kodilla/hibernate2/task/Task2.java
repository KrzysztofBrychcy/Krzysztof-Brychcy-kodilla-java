package com.kodilla.hibernate2.task;

import com.kodilla.hibernate2.tasklist.TaskList2;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "TASKS2")
public class Task2 {
    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails2 taskFinancialDetails2;
    private TaskList2 taskList2;

    public Task2() {
    }

    public Task2(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    @ManyToOne
    @JoinColumn(name = "TASKLIST2_ID")
    public TaskList2 getTaskList2() {
        return taskList2;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASKS_FINANCIALS_ID")
    public TaskFinancialDetails2 getTaskFinancialDetails2() {
        return taskFinancialDetails2;
    }

    public void setTaskFinancialDetails2(TaskFinancialDetails2 taskFinancialDetails2) {
        this.taskFinancialDetails2 = taskFinancialDetails2;
    }

    public void setTaskList2(TaskList2 taskList2) {
        this.taskList2 = taskList2;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "\nTask2{" +
                "\nid=" + id +
                "\ndescription=[" + description + ']' +
                "\ncreated=" + created +
                "\nduration=" + duration +
                '}';
    }
}
