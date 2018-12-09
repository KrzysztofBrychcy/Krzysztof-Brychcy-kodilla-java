package com.kodilla.spring.intro.shape;

public class Drawer {
    final Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String toDrawing(){
        return shape.draw();
    }

}
