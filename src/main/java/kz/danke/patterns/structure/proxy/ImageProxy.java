package kz.danke.patterns.structure.proxy;

import javafx.geometry.Point2D;
//Proxy class.
public class ImageProxy implements Image {

    private String filename;
    private Point2D location;
    private BitmapImage image;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void setLocation(Point2D point2d) {
        if (this.image != null) {
            this.image.setLocation(point2d);
        } else {
            this.location = point2d;
        }
    }

    @Override
    public Point2D getLocation() {
        if (image != null) {
            return this.image.getLocation();
        } else {
            return this.location;
        }
    }

    @Override
    public void render() {
        if (this.image == null) {
            this.image = new BitmapImage(this.filename);
        }
        if (location != null) {
            this.image.setLocation(this.location);
        }
        this.image.render();
    }
}
