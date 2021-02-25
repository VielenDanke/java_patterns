package kz.danke.patterns.state;

public class SecondAction implements Action<BaseObject, StateEnum> {

    private final Store<BaseObject, String> store;

    public SecondAction(Store<BaseObject, String> store) {
        this.store = store;
    }

    @Override
    public BaseObject transit(BaseObject baseObject, StateEnum stateEnum) {
        SecondObject secondObject = new SecondObject();
        secondObject.setId(baseObject.getId());
        secondObject.setState(stateEnum);
        store.store(secondObject);
        return secondObject;
    }
}
