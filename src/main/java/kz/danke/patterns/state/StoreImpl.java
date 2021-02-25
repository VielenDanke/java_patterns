package kz.danke.patterns.state;

import java.util.HashMap;
import java.util.Map;

public class StoreImpl implements Store<BaseObject, String> {

    private Map<String, BaseObject> stateMap = new HashMap<>();

    @Override
    public void store(BaseObject baseObject) {
        this.stateMap.put(baseObject.getId(), baseObject);
    }

    @Override
    public BaseObject get(String s) {
        return this.stateMap.get(s);
    }
}
