package com.gh.sd.behavioralpatterns.chainofresponsibility;

import static com.gh.sd.behavioralpatterns.chainofresponsibility.Employee.Role.PROJECT_LEAD;

//A concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super(PROJECT_LEAD, successor);
    }

    @Override
    protected boolean processRequest(LeaveService application) {
        //type is sick leave & duration is less than or equal to 2 days
        if (application.getType() == LeaveService.Type.SICK && (application.getNoOfDays() <= 2)) {
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
