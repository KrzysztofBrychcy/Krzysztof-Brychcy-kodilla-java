package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observalbe {
    private final List<Observer> observers;
    private final ArrayDeque<String> homeworks;
    private final String username;

    public HomeworkQueue(String username) {
        observers = new ArrayList<>();
        homeworks = new ArrayDeque<>();
        this.username = username;
    }

    public void addLink(String link) {
        homeworks.offer(link);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observ : observers) {
            observ.update(this);
        }
    }

    public ArrayDeque<String> getHomeworks() {
        return homeworks;
    }

    public String getUsername() {
        return username;
    }
}
