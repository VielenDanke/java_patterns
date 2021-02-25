package kz.danke.patterns.state;

import java.util.UUID;

public class FirstAction implements Action<String, StateEnum> {

    private final Store<BaseObject, String> store;

    public FirstAction(Store<BaseObject, String> store) {
        this.store = store;
    }

    @Override
    public String transit(String id, StateEnum stateEnum) {
        BaseObject baseObject = this.store.get(id);
        FirstObject firstObject = new FirstObject();
        firstObject.setId(baseObject.getId());
        firstObject.setState(stateEnum);
        store.store(firstObject);
        return id;
    }
}
