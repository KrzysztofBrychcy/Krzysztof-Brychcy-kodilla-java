package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> world1 = new ArrayList<>();


    public void addContinent(Continent continent){
        world1.add(continent);
    }

    public boolean removeContinent(Continent continent){
        return world1.remove(continent);
    }

    public BigDecimal getPeopleQunatity(){
        return world1.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }

}
