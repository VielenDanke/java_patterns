package kz.danke.patterns.creation.singleton;

public class LazyHolderSingleton {

    private LazyHolderSingleton() {}

    private static class LazyHolderSingletonRegistry {
        static LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
    }

    public static LazyHolderSingleton getInstance() {
        return LazyHolderSingletonRegistry.INSTANCE;
    }
}
