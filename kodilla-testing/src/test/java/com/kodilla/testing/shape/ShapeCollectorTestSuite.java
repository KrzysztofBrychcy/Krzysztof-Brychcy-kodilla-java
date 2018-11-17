package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

//Test Suite for classes of ShapeCollector
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Begining of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are done");
    }
    @Before
    public void beforeEveryTest(){
        testCounter ++;
        System.out.println("Prepering test #" + testCounter);
    }
    @Test
    public void testAddShapeCircle(){
        //Given
        Shape circle = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1,shapeCollector.getQuantityShapes());
    }
    @Test
    public void testGetShapeCircle(){
        //Given
        Shape circle = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        //When
        Shape testCircle;
        testCircle = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle,testCircle);
    }
    @Test
    public void testRemoveShapeCircle(){
        //Given
        Shape circle = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getQuantityShapes());
    }
    @Test
    public void testAddShapeTriangle(){
        //Given
        Shape triangle = new Triangle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(1,shapeCollector.getQuantityShapes());
    }
    @Test
    public void testGetShapeTriangle(){
        //Given
        Shape triangle = new Triangle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        shapeCollector.addFigure(triangle);
        //When
        Shape testTriangle;
        testTriangle = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle,testTriangle);
    }
    @Test
    public void testRemoveShapeTriangle(){
        //Given
        Shape triangle = new Triangle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getQuantityShapes());
    }
    @Test
    public void testAddShapeSquare(){
        //Given
        Shape square = new Square(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(square);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1,shapeCollector.getQuantityShapes());
    }
    @Test
    public void testGetShapeSquare(){
        //Given
        Shape square = new Square(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(square);
        //When
        Shape testSquare;
        testSquare = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square,testSquare);
    }
    @Test
    public void testRemoveShapeSquare(){
        //Given
        Shape square = new Square(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getQuantityShapes());
    }
    @Test
    public void testRemoveShapeNotExisting(){
        //Given
        Shape circle = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testGetShapes(){
        //Given
        Shape circle = new Circle(2.0);
        Shape square = new Square(2.0);
        Shape triangle = new Triangle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //When
        ArrayList<Shape> testShapes = new ArrayList<>();
        testShapes.add(circle);
        testShapes.add(triangle);
        testShapes.add(square);
        //Then
        Assert.assertEquals(testShapes,shapeCollector.showFigures());
    }

}
