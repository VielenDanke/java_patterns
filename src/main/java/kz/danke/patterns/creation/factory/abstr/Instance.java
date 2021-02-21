package kz.danke.patterns.creation.factory.abstr;

public interface Instance {

    enum Capacity {
        MICRO, SMALL, LARGE
    }

    void start();

    void attachStorage(Storage storage);

    void stop();
}
