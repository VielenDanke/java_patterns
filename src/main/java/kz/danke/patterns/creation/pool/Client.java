package kz.danke.patterns.creation.pool;

import javafx.geometry.Point2D;

public class Client {

    public static final ObjectPool<Bitmap> BITMAP_OBJECT_POOL = new ObjectPool<>(
            () -> new Bitmap("Bitmap"),
            5
    );

    public static void main(String[] args) {
        Bitmap first = BITMAP_OBJECT_POOL.get();
        Bitmap second = BITMAP_OBJECT_POOL.get();
        first.setLocation(new Point2D(10, 10));
        second.setLocation(new Point2D(-10, 0));

        first.draw();
        second.draw();

        BITMAP_OBJECT_POOL.release(first);
        BITMAP_OBJECT_POOL.release(second);
    }
}
