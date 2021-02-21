package kz.danke.patterns.creation.factory.abstr;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        System.out.printf("Allocated %d in GoogleCloudStorage\n", capacityInMib);
    }

    @Override
    public String getId() {
        return "GoogleCloudStorageID";
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage";
    }
}
