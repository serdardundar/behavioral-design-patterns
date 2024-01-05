package com.gh.sd.behavioralpatterns.chainofresponsibility;

import static com.gh.sd.behavioralpatterns.chainofresponsibility.Employee.Role.DIRECTOR;

public class Director extends Employee {

    public Director(LeaveApprover nextApprover) {
        super(DIRECTOR, nextApprover);
    }

    @Override
    protected boolean processRequest(LeaveService application) {
        if (application.getType() == LeaveService.Type.PTO) {
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
