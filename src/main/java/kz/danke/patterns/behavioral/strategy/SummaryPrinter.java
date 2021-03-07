package kz.danke.patterns.behavioral.strategy;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

public class SummaryPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("Summary report");
        AtomicInteger num = new AtomicInteger(0);

        Double total = orders.stream().map(o -> {
            int n = num.incrementAndGet();
            System.out.printf("%d. %s\t%s\t%d\t%f\n", n, o.getId(), o.getDate(), o.getItems().size(), o.getTotal());
            return o.getTotal();
        }).reduce(Double::sum).orElseThrow(() -> new RuntimeException("Cannot count the total"));
        System.out.println("Summary report done");
        System.out.printf("The total is %f\n", total);
    }
}
