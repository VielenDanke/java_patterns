package kz.danke.patterns.structure.bridge;

public interface FifoCollection<T> {

    void offer(T element);

    T poll();
}
