package kz.danke.patterns.behavioral.nullobject;

public class NullStorageService extends StorageService {

    @Override
    public void save(Report report) {
        System.out.println("Null object save method");
    }
}
