package com.kodilla.good.patterns.challanges;

public class OrderProccesor {
    private InformationService informationService;
    private OrderServive orderServive;
    private OrderRepository orderRepository;

    public OrderProccesor(final InformationService informationService, final OrderServive orderServive, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderServive = orderServive;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderServive.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());

        if(isOrdered){
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
