package kz.danke.patterns.structure.decorator;

import org.apache.commons.text.StringEscapeUtils;

public class HtmlEncodedMessage implements Message {

    private final Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(this.message.getContent());
    }
}
