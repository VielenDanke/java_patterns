package kz.danke.patterns.structure.proxy;

import javafx.geometry.Point2D;

public class Client {

	public static void main(String[] args) {
		Image image = ImageFactory.getImage("image.png");
		image.setLocation(new Point2D(10, 20));
		System.out.printf("Location: %s, class %s\n", image.getLocation().toString(), image.getClass().getSimpleName());
		image.render();
		System.out.printf("Location: %s, class %s\n", image.getLocation().toString(), image.getClass().getSimpleName());
	}
}
