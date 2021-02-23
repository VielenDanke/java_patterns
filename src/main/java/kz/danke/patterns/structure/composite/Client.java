package kz.danke.patterns.structure.composite;

import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
        File file = new Directory("Directory");
        createData()
                .forEach(file::addFile);
        file.printAllFiles();
    }

    private static Stream<File> createData() {
        return Stream.iterate(0, i -> i + 1)
                .limit(100)
                .map(i -> new BinaryFile(String.format("File %d", i), 200 + i));
    }
}
