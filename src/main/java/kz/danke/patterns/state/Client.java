package kz.danke.patterns.state;

import java.util.UUID;

public class Client {

    public static void main(String[] args) {
        Store<BaseObject, String> store = new StoreImpl();
        StateMachine<String, StateEnum> stateMachine = new StateMachineImpl(store);

        BaseObject s = new InternalState();
        s.setId(UUID.randomUUID().toString());

        BaseObject state = store.store(s);

        stateMachine.changeState(state.getId(), StateEnum.FIRST);
        stateMachine.changeState(state.getId(), StateEnum.SECOND);

        BaseObject baseObject = store.get(s.getId());
        System.out.printf("ID %s, State %s, Class %s\n", baseObject.getId(), baseObject.getState().name(), baseObject.getClass().getSimpleName());
    }
}
