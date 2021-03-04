package kz.danke.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private List<OrderObserver> observers = new ArrayList<>();

    private double itemsCost;
    private int count;
    private double discount;
    private double shippingCost;

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getTotal() {
        return itemsCost - discount;
    }

    public void addItem(double price) {
        itemsCost += price;
        count++;
        observers.forEach(o -> o.updated(this));
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItemsCost(double itemsCost) {
        this.itemsCost = itemsCost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<OrderObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<OrderObserver> observers) {
        this.observers = observers;
    }
}
