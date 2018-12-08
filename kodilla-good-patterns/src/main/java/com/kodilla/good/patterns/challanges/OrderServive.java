package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public interface OrderServive {
    boolean order(User user, Product product, LocalDateTime orderDate);
}
