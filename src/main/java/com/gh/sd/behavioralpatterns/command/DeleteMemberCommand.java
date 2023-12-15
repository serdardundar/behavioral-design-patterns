package com.gh.sd.behavioralpatterns.command;

public class DeleteMemberCommand implements Command{

    private final String emailAdress;
    private final String listName;

    public DeleteMemberCommand(String emailAdress, String listName) {
        this.emailAdress = emailAdress;
        this.listName = listName;
    }

    @Override
    public void execute() {
        System.out.println("Delete member " + emailAdress + " from " + listName);
    }
}
