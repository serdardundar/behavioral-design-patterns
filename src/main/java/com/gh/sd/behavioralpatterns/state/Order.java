package com.gh.sd.behavioralpatterns.state;

// Context class
public class Order {

    private OrderState state = new New();

    protected void processed() {
        state = state.next();
    }

    public double cancel() {
        double charges = state.handleCancellation();
        state = new Cancelled();
        return charges;
    }

    public void paymentSuccessful() {
        processed();
    }

    public void dispatched() {
        processed();
    }

    public void delivered() {
        processed();
    }
}
