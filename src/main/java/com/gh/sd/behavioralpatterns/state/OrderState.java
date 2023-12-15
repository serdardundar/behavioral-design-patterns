package com.gh.sd.behavioralpatterns.state;

//Abstract state
public interface OrderState {

    double handleCancellation();

    OrderState next();
}
