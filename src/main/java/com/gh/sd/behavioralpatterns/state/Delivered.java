package com.gh.sd.behavioralpatterns.state;

public class Delivered implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for item pickup");
        System.out.println("Payment roll back will be initiated upon receiving returned item");
        return 30;
    }

    @Override
    public OrderState next() {
        return new New();
    }
}
