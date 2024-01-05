package com.gh.sd.behavioralpatterns.chainofresponsibility;

import static com.gh.sd.behavioralpatterns.chainofresponsibility.LeaveService.Type.SICK;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        LeaveService service = LeaveService.getBuilder().withType(SICK)
            .from(LocalDate.now()).to(LocalDate.now().plusDays(5))
            .build();
        System.out.println(service);
        System.out.println("**************************************************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(service);
        System.out.println(service);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        return new ProjectLead(manager);
    }
}
