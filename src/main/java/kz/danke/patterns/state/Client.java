package kz.danke.patterns.state;

public class Client {

    public static void main(String[] args) {
        Store<BaseObject, String> store = new StoreImpl();
        StateMachine<BaseObject, StateEnum> stateMachine = new StateMachineImpl(store);

        BaseObject state;

        state = stateMachine.transit(new FirstObject(), StateEnum.FIRST);
        System.out.printf("ID %s, State %s\n", state.getId(), state.getState().name());
        state = stateMachine.transit(state, StateEnum.SECOND);
        System.out.printf("ID %s, State %s\n", state.getId(), state.getState().name());
    }
}
