package com.gh.sd.behavioralpatterns.state;

public class Cancelled implements OrderState {
    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancelled order. Cannot cancel anymore");
    }

    @Override
    public OrderState next() {
        return new New();
    }
}
