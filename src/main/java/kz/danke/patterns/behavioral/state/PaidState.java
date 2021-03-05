package kz.danke.patterns.behavioral.state;

public class PaidState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transaction");
        return 10;
    }
}
