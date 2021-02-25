package kz.danke.patterns.state;

public abstract class BaseObject {

    private String id;
    private StateEnum state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }
}
