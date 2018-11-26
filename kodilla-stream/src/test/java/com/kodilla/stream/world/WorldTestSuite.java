package com.kodilla.stream.world;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world1 = new World();

        //When
        Continent continent1 = new Continent("Euro1");
        Continent continent2 = new Continent("Euro2");
        Continent continent3 = new Continent("Euro3");
        continent1.addCounttry(new Country("Pol1", new BigDecimal("1000000000000")));
        continent1.addCounttry(new Country("Pol2", new BigDecimal("1000000000000")));
        continent1.addCounttry(new Country("Pol3", new BigDecimal("1000000000000")));
        continent2.addCounttry(new Country("USA1", new BigDecimal("1000000000000")));
        continent2.addCounttry(new Country("USA2", new BigDecimal("1000000000000")));
        continent2.addCounttry(new Country("USA3", new BigDecimal("1000000000000")));
        continent3.addCounttry(new Country("CHN1", new BigDecimal("1000000000000")));
        continent3.addCounttry(new Country("CHN2", new BigDecimal("1000000000000")));
        continent3.addCounttry(new Country("CHN3", new BigDecimal("1000000000000")));
        world1.addContinent(continent1);
        world1.addContinent(continent2);
        world1.addContinent(continent3);

        //Then
        BigDecimal totalPeopleQuantity = new BigDecimal("9000000000000");
        Assert.assertEquals(totalPeopleQuantity,world1.getPeopleQunatity());

    }
}
