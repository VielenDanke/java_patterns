package kz.danke.patterns.creation.factory.abstr;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int capacityInMib) {
        Instance instance = this.resourceFactory.createInstance(capacity);
        Storage storage = this.resourceFactory.createStorage(capacityInMib);
        instance.attachStorage(storage);
        return instance;
    }

    public ResourceFactory getResourceFactory() {
        return resourceFactory;
    }

    public static void main(String[] args) {
        Client client = new Client(new GoogleCloudResourceFactory());

        Instance server = client.createServer(Instance.Capacity.LARGE, 1024);

        server.start();
        server.stop();
    }


}
