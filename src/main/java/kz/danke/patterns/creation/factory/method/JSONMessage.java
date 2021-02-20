package kz.danke.patterns.creation.factory.method;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
