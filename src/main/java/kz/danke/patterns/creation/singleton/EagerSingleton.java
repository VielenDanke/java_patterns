package kz.danke.patterns.creation.singleton;

public class EagerSingleton {
    
    private EagerSingleton() {}

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
