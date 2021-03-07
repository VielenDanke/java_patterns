package kz.danke.patterns.behavioral.strategy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String id;
    private LocalDate date;
    private Map<String, Double> items = new HashMap<>();
    private double total;

    public Order(String id) {
        this.id = id;
        this.date = LocalDate.now();
    }

    public void addItem(String name, double price) {
        this.items.put(name, price);
    }

    public void calculateTotal() {
        this.total = this.items.values().stream().reduce(Double::sum).orElse(0.0);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void setItems(Map<String, Double> items) {
        this.items = items;
    }

    public double getTotal() {
        calculateTotal();
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
