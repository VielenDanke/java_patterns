package kz.danke.patterns.state;

public class StateMachineImpl implements StateMachine<String, StateEnum> {

    private final Store<BaseObject, String> store;

    public StateMachineImpl(Store<BaseObject, String> store) {
        this.store = store;
    }

    @Override
    public void changeState(String id, StateEnum stateEnum) {
        Action<String, StateEnum> action = stateAction(stateEnum);
        action.transit(id, stateEnum);
    }

    @Override
    public Action<String, StateEnum> stateAction(StateEnum stateEnum) {
        switch (stateEnum) {
            case FIRST -> {
                return new FirstAction(store);
            }
            case SECOND -> {
                return new SecondAction(store);
            }
            default -> throw new UnsupportedOperationException();
        }
    }
}
