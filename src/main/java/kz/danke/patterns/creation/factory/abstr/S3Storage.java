package kz.danke.patterns.creation.factory.abstr;

public class S3Storage implements Storage {

    public S3Storage(int capacityInMib) {
        System.out.printf("Allocated %d on S3\n", capacityInMib);
    }

    @Override
    public String getId() {
        return "S3ID";
    }

    @Override
    public String toString() {
        return "S3 storage";
    }
}
