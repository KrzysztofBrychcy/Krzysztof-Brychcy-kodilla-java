package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testToDrawingWithCircle(){
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.toDrawing();
        //Then
        Assert.assertEquals("This is a circle",result);

    }
    @Test
    public void testToDrawingWithTriangle(){
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.toDrawing();
        //Then
        Assert.assertEquals("This is a triangle",result);
    }
}
