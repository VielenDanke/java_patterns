package kz.danke.patterns.behavioral.strategy;

import java.util.Collection;

public class DetailPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("Detail printer");
    }
}
