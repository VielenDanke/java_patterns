package kz.danke.patterns.creation.singleton;

import java.util.concurrent.CompletableFuture;

public class Client {

    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton secInstance = EagerSingleton.getInstance();
        CompletableFuture<LazySingleton> f = CompletableFuture.supplyAsync(() -> LazySingleton.getInstance());
        CompletableFuture<LazySingleton> s = CompletableFuture.supplyAsync(() -> LazySingleton.getInstance());
        LazySingleton fSingleton = f.join();
        LazySingleton sSingleton = s.join();
        System.out.println(fSingleton == sSingleton);

    }
}
