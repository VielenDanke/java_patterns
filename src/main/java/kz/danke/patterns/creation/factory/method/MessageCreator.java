package kz.danke.patterns.creation.factory.method;

public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    public abstract Message createMessage();
}
