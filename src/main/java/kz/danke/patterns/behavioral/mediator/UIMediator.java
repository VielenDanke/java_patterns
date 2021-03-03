package kz.danke.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIMediator {

    private List<UIControl> colleagues = new ArrayList<>();

    public boolean register(UIControl control) {
        return colleagues.add(control);
    }

    public void valueChanged(UIControl control) {
        colleagues.stream().filter(c -> !c.equals(control)).forEach(c -> c.controlChanged(control));
    }
}
