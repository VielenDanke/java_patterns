package kz.danke.patterns.creation.factory.method;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.createMessage();
        System.out.println(message.getContent());
    }
}
