package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double shapeValue;

    public Triangle(double shapeValue) {
        this.shapeValue = shapeValue;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public double getField(){
        return (Math.pow(shapeValue,2) * Math.sqrt(3)) / 4;
    }

    public double getShapeValue() {
        return shapeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.shapeValue, shapeValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeValue);
    }
}
