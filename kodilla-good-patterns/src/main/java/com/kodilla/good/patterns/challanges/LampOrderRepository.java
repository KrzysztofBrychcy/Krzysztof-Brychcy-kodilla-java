package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LampOrderRepository implements OrderRepository {
    private final List<OrderRequest> orderRequestsRepository = new ArrayList<>();


    @Override
    public boolean createOrder(User user, Product product, LocalDateTime orderDate) {
        orderRequestsRepository.add(new OrderRequest(user,product,orderDate));
        return true;
    }
}
