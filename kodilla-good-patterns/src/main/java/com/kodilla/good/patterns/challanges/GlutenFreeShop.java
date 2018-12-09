package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class GlutenFreeShop implements CompanySpecialOffer {
    private final String companyName = "Gluten Free Shop";

    public boolean specialOffer(User user, Product product, LocalDateTime orderDate) {

        System.out.println("To: " + user.getUserName() + user.getUserSurname() + " to: " + product.getProductName() + " on date: " + orderDate.toString() + " Is added a special bonus from " + companyName);

    return true;
    }

}
