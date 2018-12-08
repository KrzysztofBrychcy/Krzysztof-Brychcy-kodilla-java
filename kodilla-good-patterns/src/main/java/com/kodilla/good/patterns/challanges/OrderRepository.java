package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, Product product, LocalDateTime orderDate);
}
