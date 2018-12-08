package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class LampOrderService implements OrderServive {

    @Override
    public boolean order(final User user, final Product product, final LocalDateTime orderDate) {

        System.out.println("Ordering a " + product.getProductName() + ". Quantity: " + product.getProductQuantity()
                + "\nFor: " + user.getUserName() + " " + user.getUserSurname() + " in date: " + orderDate.toString());

        return true;
    }
}
