package kz.danke.patterns.state;

public interface Store<T, ID> {

    void store(T t);

    T get(ID id);
}
