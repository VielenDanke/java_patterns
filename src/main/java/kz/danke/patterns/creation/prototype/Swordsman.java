package kz.danke.patterns.creation.prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }

    @Override
    public String toString() {
        return String.format("Swordsman %s @ %s", this.state, getPosition());
    }
}
