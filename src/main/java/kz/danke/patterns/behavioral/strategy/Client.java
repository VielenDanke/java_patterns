package kz.danke.patterns.behavioral.strategy;

import java.util.LinkedList;

public class Client {

    private static LinkedList<Order> orderList = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();
        OrderPrinter printer = new SummaryPrinter();
        PrintService ps = new PrintService(printer);
        ps.printOrders(orderList);
    }

    private static void createOrders() {
        Order o = new Order("100");
        o.addItem("Soap", 2);
        o.addItem("Chips", 10);
        orderList.add(o);

        o = new Order("200");
        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orderList.add(o);

        o = new Order("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orderList.add(o);
    }
}
