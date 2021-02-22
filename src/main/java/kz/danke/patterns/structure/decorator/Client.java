package kz.danke.patterns.structure.decorator;

public class Client {

    public static void main(String[] args) {
        Message message = new TextMessage("some <FORCE> text");
        Message base64Message = new Base64EncodedMessage(message);
        Message htmlMessage = new HtmlEncodedMessage(message);

        System.out.println(htmlMessage.getContent());
    }
}
