package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int queueLong;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + " New link in " + homeworkQueue.getUsername() + "`s homeworks\n" + "(total: " + homeworkQueue.getHomeworks().size() + " links to check)");
        queueLong ++;
    }

    public String getName() {
        return name;
    }

    public int getQueueLong() {
        return queueLong;
    }
}
