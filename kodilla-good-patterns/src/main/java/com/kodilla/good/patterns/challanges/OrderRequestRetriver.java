package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {
    public OrderRequest retrieve() {

        User user = new User("Krzysztof", "Nijaki", 123);
        Product product = new Product("Lamp Model:123",2);
        LocalDateTime orderDate = LocalDateTime.of(2018,12,8,16,33);

        return new OrderRequest(user, product, orderDate);
    }
}
