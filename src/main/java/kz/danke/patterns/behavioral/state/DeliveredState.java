package kz.danke.patterns.behavioral.state;

public class DeliveredState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.printf(this.getClass().getSimpleName() + " %s", "is canceled");
        return 30;
    }
}
