package com.gh.sd.behavioralpatterns.command;

/**
 * A concrete implementation of {@link Command}
 */
public class AddMemberCommand implements Command {

    private final String emailAdress;
    private final String listName;

    private final EWSService receiver;

    public AddMemberCommand(String emailAdress, String listName, EWSService receiver) {
        this.emailAdress = emailAdress;
        this.listName = listName;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addMember(emailAdress, listName);
    }
}
