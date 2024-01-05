package com.gh.sd.behavioralpatterns.chainofresponsibility;

import static com.gh.sd.behavioralpatterns.chainofresponsibility.Employee.Role.MANAGER;

//A concrete handler
public class Manager extends Employee {

    public Manager(LeaveApprover nextApprover) {
        super(MANAGER, nextApprover);
    }

    @Override
    protected boolean processRequest(LeaveService application) {
        if (application.getType().equals(LeaveService.Type.SICK) ||
            (application.getType().equals(LeaveService.Type.PTO) && application.getNoOfDays() <= 5)) {
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}