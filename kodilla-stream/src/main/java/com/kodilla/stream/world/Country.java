package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private final String countryName;
    private BigDecimal quntityPeopleInCountry;


    public Country(String countryName, BigDecimal quntityPeopleInCountry) {
        this.countryName = countryName;
        this.quntityPeopleInCountry = quntityPeopleInCountry;
    }


    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return quntityPeopleInCountry;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName);
    }
}
