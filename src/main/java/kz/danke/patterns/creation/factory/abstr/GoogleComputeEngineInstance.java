package kz.danke.patterns.creation.factory.abstr;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Create GoogleComputeEngineInstance");
    }

    @Override
    public void start() {
        System.out.println("Start GoogleComputeEngineInstance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.printf("Attached %s to GoogleComputeEngineInstance\n", storage.toString());
    }

    @Override
    public void stop() {
        System.out.println("Stop GoogleComputeEngineInstance");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance";
    }
}
