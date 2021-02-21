package kz.danke.patterns.creation.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void getConfiguration() {
        System.out.println("Configuration");
    }
}
