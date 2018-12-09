package com.kodilla.good.patterns.challanges;

public class Application {
    public static void main(String args[]) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProccesor orderProccesor = new OrderProccesor(new SmsService(), new LampOrderService(), new LampOrderRepository(), new GlutenFreeShop());
        orderProccesor.process(orderRequest);

    }
}
