package com.kodilla.kodillapatterns2.observer.homework;


public interface Observalbe {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
