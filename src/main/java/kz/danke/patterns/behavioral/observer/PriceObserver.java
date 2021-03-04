package kz.danke.patterns.behavioral.observer;

public class PriceObserver implements OrderObserver {

    private final double discountPrice;

    public PriceObserver(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public void updated(Order order) {
        double total = order.getTotal();
        if (total > discountPrice) {
            order.setDiscount(10.0);
        }
    }
}
