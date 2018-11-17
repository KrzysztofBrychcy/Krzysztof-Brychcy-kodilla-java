package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double shapeValue;

    public Square(double shapeValue) {
        this.shapeValue = shapeValue;
    }

    public String getShapeName(){
        return "Square";
    }

    public double getField(){
        return Math.pow(shapeValue,2);
    }

    public double getShapeValue() {
        return shapeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.shapeValue, shapeValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeValue);
    }
}
