package kz.danke.patterns.behavioral.state;

public class Order {

    private OrderState currentState;

    public Order() {
        currentState = new NewState();
    }

    public double cancel() {
        double res = currentState.handleCancellation();
        currentState = new CanceledState();
        return res;
    }

    public void paymentSuccessful() {
        currentState = new PaidState();
    }

    public void dispatched() {
        currentState = new InTransitState();
    }

    public void delivered() {
        currentState = new DeliveredState();
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    @Override
    public String toString() {
        return "Order{" +
                "currentState=" + currentState.getClass().getSimpleName() +
                '}';
    }
}
