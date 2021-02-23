package kz.danke.patterns.structure.composite;

public class BinaryFile extends File {

    private final long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.printf("%s\t%d\n", getName(), this.size);
    }

    @Override
    public void printAllFiles() {
        throw new UnsupportedOperationException("Print all files not supported by Binary file");
    }

    @Override
    public long countFileSizeSum() {
        throw new UnsupportedOperationException("Count all file size sum not supported by Binary file");
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Add file is not supported in Binary file");
    }

    public long getSize() {
        return size;
    }
}
