package kz.danke.patterns.structure.flyweight;

//A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage {

    // some error message $errorCode
    private String messageTemplate;

    // http://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        String errorCode = this.messageTemplate.replace("$errorCode", code);
        return String.format("%s%s%s", errorCode, this.helpUrlBase, code);
    }
}
