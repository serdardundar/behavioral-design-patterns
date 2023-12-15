package com.gh.sd.behavioralpatterns.command;

//This class is receiver.
public class EWSService {

    public void addMember(String contact, String contactGroup) {
        //contact exchange
        System.out.println("Added " + contact + " to " + contactGroup);
    }

    public void removeMember(String contact, String contactGroup) {
        //contact exchange
        System.out.println("Removed " + contact + " from " + contactGroup);
    }
}
