package kz.danke.patterns.state;

public interface Store<T, ID> {

    T store(T t);

    T get(ID id);
}
