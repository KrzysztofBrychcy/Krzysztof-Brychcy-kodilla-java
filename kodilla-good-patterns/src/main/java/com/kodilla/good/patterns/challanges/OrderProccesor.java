package com.kodilla.good.patterns.challanges;

public class OrderProccesor {
    private InformationService informationService;
    private OrderServive orderServive;
    private OrderRepository orderRepository;
    private CompanySpecialOffer companySpecialOffer;

    public OrderProccesor(final InformationService informationService, final OrderServive orderServive, final OrderRepository orderRepository, final CompanySpecialOffer companySpecialOffer) {
        this.informationService = informationService;
        this.orderServive = orderServive;
        this.orderRepository = orderRepository;
        this.companySpecialOffer = companySpecialOffer;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderServive.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());

        if(isOrdered){
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            companySpecialOffer.specialOffer(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
