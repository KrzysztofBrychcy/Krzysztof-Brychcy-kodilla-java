package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {
    BigDecimal getCosts();
    String getDescription();

}
