package kz.danke.patterns.behavioral.template;

import java.util.Map;

public class TextPrinter extends OrderPrinter {

    @Override
    protected String start() {
        return "Order Details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return String.format("Order #%s\n", order.getId());
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder("Items\n-----------------\n");
        order.getItems().forEach((key, value) -> builder.append(String.format("%s $%f\n", key, value)));
        builder.append("-----------------\n");
        return builder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return String.format("Total: $%f\n", order.getTotal());
    }

    @Override
    protected String end() {
        return "";
    }
}
