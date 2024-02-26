package com.gh.sd.behavioralpatterns.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
