package kz.danke.patterns.state;

public interface StateMachine<T, S> {

    void changeState(T t, S s);

    Action<T, S> stateAction(S s);
}
