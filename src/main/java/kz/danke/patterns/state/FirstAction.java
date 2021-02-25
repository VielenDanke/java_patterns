package kz.danke.patterns.state;

import java.util.UUID;

public class FirstAction implements Action<BaseObject, StateEnum> {

    private final Store<BaseObject, String> store;

    public FirstAction(Store<BaseObject, String> store) {
        this.store = store;
    }

    @Override
    public BaseObject transit(BaseObject baseObject, StateEnum stateEnum) {
        baseObject.setId(UUID.randomUUID().toString());
        baseObject.setState(stateEnum);
        store.store(baseObject);
        return baseObject;
    }
}
