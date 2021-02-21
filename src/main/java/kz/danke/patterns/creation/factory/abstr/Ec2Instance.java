package kz.danke.patterns.creation.factory.abstr;

public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        System.out.println("Created Es2Instance");
    }

    @Override
    public void start() {
        System.out.println("Start Es2Instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.printf("Attached %s to Es2Instance\n", storage.toString());
    }

    @Override
    public void stop() {
        System.out.println("Stop Es2Instance");
    }

    @Override
    public String toString() {
        return "Es2Instance";
    }
}
