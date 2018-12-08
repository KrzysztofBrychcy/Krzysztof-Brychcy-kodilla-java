package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class OrderRequest {
    User user;
    Product product;
    LocalDateTime orderDate;

    public OrderRequest(User user, Product product, LocalDateTime orderDate) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
