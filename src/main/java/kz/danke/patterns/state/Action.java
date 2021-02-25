package kz.danke.patterns.state;

public interface Action<T, S> {

    T transit(T t, S s);
}
