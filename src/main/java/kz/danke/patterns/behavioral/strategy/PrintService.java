package kz.danke.patterns.behavioral.strategy;

import java.util.Collection;

public class PrintService {

    private final OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(Collection<Order> orderList) {
        printer.print(orderList);
    }
}
