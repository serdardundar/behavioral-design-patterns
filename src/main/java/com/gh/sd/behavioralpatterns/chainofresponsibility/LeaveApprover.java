package com.gh.sd.behavioralpatterns.chainofresponsibility;

import com.gh.sd.behavioralpatterns.chainofresponsibility.Employee.Role;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveApplication(LeaveService application);

    Role getApproverRole();
}
