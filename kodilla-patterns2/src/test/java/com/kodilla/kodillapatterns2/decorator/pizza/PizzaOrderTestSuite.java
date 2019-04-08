package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Give
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        BigDecimal cost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescripiton() {
        //Give
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Pizza Margarhita", description);
    }

    @Test
    public void testMyFavoritePizzaOrderGetCost() {
        //Give
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new FetaCheeseDecorator(thePizza);
        thePizza = new SalamiDecorator(thePizza);
        //When
        BigDecimal cost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(23), cost);
    }

    @Test
    public void testMyFavoritePizzaOrderGetDescripiton() {
        //Give
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new FetaCheeseDecorator(thePizza);
        thePizza = new SalamiDecorator(thePizza);
        //When
        String descripiton = thePizza.getDescription();
        //Then
        assertEquals("Pizza Margarhita + feta + salami", descripiton);
    }
}
