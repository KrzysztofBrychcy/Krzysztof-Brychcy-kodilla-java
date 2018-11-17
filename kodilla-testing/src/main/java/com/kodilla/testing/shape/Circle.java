package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private double shapeValue;

    public Circle(double shapeValue) {
        this.shapeValue = shapeValue;
    }

    public String getShapeName(){
        return "Circle";
    }
    public double getField(){
        return Math.PI * (Math.pow(shapeValue,2));
    }

    public double getShapeValue() {
        return shapeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.shapeValue, shapeValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeValue);
    }
}
