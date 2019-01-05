package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVIGTASK";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Biedronka", "Apple",3);
            case PAINTINGTASK:
                return new PaintingTask("Jedynka", "White", "Roof");
            case DRIVINGTASK:
                return new DrivingTask("Trip1", "Berlin", "Train");
            default:
                return null;
        }
    }
}
