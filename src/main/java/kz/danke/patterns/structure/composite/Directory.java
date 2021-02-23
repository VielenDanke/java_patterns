package kz.danke.patterns.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

    private final List<File> fileList;

    public Directory(String name) {
        super(name);
        this.fileList = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.printf("%s with files %d\n", getName(), this.fileList.size());
    }

    @Override
    public void printAllFiles() {
        for (File f : this.fileList) {
            BinaryFile b = (BinaryFile) f;
            System.out.printf("File %s with size %d\n", b.getName(), b.getSize());
        }
    }

    @Override
    public long countFileSizeSum() {
        long countSize = 0;
        for (File f : this.fileList) {
            BinaryFile b = (BinaryFile) f;
            countSize += b.getSize();
        }
        return countSize;
    }

    @Override
    public void addFile(File file) {
        this.fileList.add(file);
    }
}
