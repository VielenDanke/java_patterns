package kz.danke.patterns.behavioral.state;

public class NewState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("NewState, empty process");
        return 0;
    }
}
