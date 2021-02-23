package kz.danke.patterns.structure.composite;

public class BinaryFile extends File {

    private final long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {

    }

    @Override
    public void printName() {

    }

    @Override
    public void printAllFiles() {

    }

    @Override
    public void countFileSizeSum() {

    }
}
