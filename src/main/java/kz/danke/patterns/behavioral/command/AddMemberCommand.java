package kz.danke.patterns.behavioral.command;

public class AddMemberCommand implements Command {

    private String email;
    private String listName;
    private EWSService receiver;

    public AddMemberCommand(String email, String listName, EWSService receiver) {
        this.email = email;
        this.listName = listName;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addMember(email, listName);
    }
}
