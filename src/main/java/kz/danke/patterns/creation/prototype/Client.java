package kz.danke.patterns.creation.prototype;

import javafx.geometry.Point3D;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman sw = new Swordsman();

        sw.move(new Point3D(-10, 0,0), 20);

        sw.attack();

        System.out.println(sw);

        Swordsman sw2 = (Swordsman) sw.clone();

        System.out.println(sw2);
    }
}
