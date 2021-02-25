package kz.danke.patterns.state;

public interface StateMachine<T, S> {

    T transit(T t, StateEnum stateEnum);

    Action<T, S> stateAction(S s);
}
