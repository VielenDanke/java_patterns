package kz.danke.patterns.creation.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }
        this.availablePool = new LinkedBlockingQueue<>();
        while (count > 0) {
            availablePool.offer(creator.get());
            count--;
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println(e.getLocalizedMessage());
        }
        return null;
    }

    public void release(T t) {
        try {
            t.reset();
            this.availablePool.put(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
