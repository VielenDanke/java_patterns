package kz.danke.patterns.state;

public class StateMachineImpl implements StateMachine<BaseObject, StateEnum> {

    private final Store<BaseObject, String> store;

    public StateMachineImpl(Store<BaseObject, String> store) {
        this.store = store;
    }

    @Override
    public BaseObject transit(BaseObject baseObject, StateEnum stateEnum) {
        Action<BaseObject, StateEnum> action = stateAction(stateEnum);
        return action.transit(baseObject, stateEnum);
    }

    @Override
    public Action<BaseObject, StateEnum> stateAction(StateEnum stateEnum) {
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
