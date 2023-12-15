package com.gh.sd.behavioralpatterns.state;

public class InTransit implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Contacting payment service for transaction roll back");
        return 20;
    }
}
