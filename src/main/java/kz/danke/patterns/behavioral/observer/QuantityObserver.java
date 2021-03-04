package kz.danke.patterns.behavioral.observer;

public class QuantityObserver implements OrderObserver {

    private final int quantity;

    public QuantityObserver(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void updated(Order order) {
        int count = order.getCount();
        if (count <= quantity) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (count - 5) * 1.5);
        }
    }
}
