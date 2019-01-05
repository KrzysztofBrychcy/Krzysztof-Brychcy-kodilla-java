package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Give
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sezam")
                .burgers(2)
                .sauce("standard")
                .ingridient("onion")
                .ingridient("becon")
                .ingridient("cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngr = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngr);
    }
}
