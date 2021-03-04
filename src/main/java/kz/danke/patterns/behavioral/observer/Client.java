package kz.danke.patterns.behavioral.observer;

import java.util.UUID;

public class Client {

    public static void main(String[] args) {
        OrderObserver observer = new PriceObserver(200);
        OrderObserver shippingObserver = new QuantityObserver(5);

        String uniqueId = UUID.randomUUID().toString();

        Order order = new Order(uniqueId);

        order.attach(observer);
        order.attach(shippingObserver);

        order.addItem(11);
        order.addItem(161);

        System.out.println(order.getDiscount());

        order.addItem(30);

        System.out.println(order.getDiscount());
    }
}
