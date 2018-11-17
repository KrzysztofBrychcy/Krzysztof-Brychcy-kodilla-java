package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        shapes.add(shape);

    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;

    }

    public int getQuantityShapes(){
        return shapes.size();
    }

    public Shape getFigure(int shapeNumber){
        Shape theShape = null;
        if(shapeNumber >= 0 && shapeNumber < shapes.size()){
            theShape = shapes.get(shapeNumber);
        }
        return theShape;
    }

    public ArrayList showFigures(){
        return shapes;
    }
}
