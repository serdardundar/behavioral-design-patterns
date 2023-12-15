package com.gh.sd.behavioralpatterns.state;

public class New implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("It's a new order. No processing done.");
        return 0;
    }

    @Override
    public OrderState next() {
        return new Paid();
    }
}
