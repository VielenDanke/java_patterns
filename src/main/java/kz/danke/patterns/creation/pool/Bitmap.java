package kz.danke.patterns.creation.pool;

import javafx.geometry.Point2D;

public class Bitmap implements Image {

    private Point2D location;
    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        this.location = Point2D.ZERO;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing %s @ %s\n", this.name, this.location.toString());
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }
}
