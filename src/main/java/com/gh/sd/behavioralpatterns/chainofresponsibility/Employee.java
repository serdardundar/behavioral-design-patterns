package com.gh.sd.behavioralpatterns.chainofresponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {

    public enum Role {PROJECT_LEAD, DIRECTOR, MANAGER}

    private final Role role;

    private final LeaveApprover successor;

    protected Employee(Role role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveService application) {
        if (!processRequest(application) && successor != null) {
            successor.processLeaveApplication(application);
        }
    }

    protected abstract boolean processRequest(LeaveService application);

    @Override
    public Role getApproverRole() {
        return role;
    }
}