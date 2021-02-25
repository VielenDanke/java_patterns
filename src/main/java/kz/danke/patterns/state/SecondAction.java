package kz.danke.patterns.state;

public class SecondAction implements Action<String, StateEnum> {

    private final Store<BaseObject, String> store;

    public SecondAction(Store<BaseObject, String> store) {
        this.store = store;
    }

    @Override
    public String transit(String id, StateEnum stateEnum) {
        BaseObject baseObject = this.store.get(id);
        SecondObject secondObject = new SecondObject();
        secondObject.setState(stateEnum);
        secondObject.setId(baseObject.getId());
        store.store(secondObject);
        return id;
    }
}
