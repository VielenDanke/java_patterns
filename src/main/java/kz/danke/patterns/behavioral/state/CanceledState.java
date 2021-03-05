package kz.danke.patterns.behavioral.state;

public class CanceledState implements OrderState {

    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Nobody can call cancellation on already canceled state");
    }
}
