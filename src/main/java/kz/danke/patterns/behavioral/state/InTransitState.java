package kz.danke.patterns.behavioral.state;

public class InTransitState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("InTransit state is canceled");
        return 20;
    }
}
