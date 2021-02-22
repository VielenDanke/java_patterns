package kz.danke.patterns.structure.decorator;

public class TextMessage implements Message {

    private final String text;

    public TextMessage(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return this.text;
    }
}
