package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class FetaCheeseDecorator extends AbstractPizzaOrderDecorator {
    public FetaCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + feta";
    }
}
