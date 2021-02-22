package kz.danke.patterns.structure.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncodedMessage implements Message {

    private final Message textMessage;

    public Base64EncodedMessage(Message textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(this.textMessage.getContent().getBytes(StandardCharsets.UTF_8));
    }
}
