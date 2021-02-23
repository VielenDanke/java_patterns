package kz.danke.patterns.structure.composite;

public abstract class File {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    public abstract void ls();

    public abstract void printName();

    public abstract void printAllFiles();

    public abstract void countFileSizeSum();

    public String getName() {
        return name;
    }
}
