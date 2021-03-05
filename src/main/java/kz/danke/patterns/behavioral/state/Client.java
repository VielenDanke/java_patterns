package kz.danke.patterns.behavioral.state;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();

        order.paymentSuccessful();
        System.out.println(order.getCurrentState());
        order.dispatched();
        order.delivered();
        order.cancel();
    }
}
