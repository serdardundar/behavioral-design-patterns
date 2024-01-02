package com.gh.sd.behavioralpatterns.strategy;

import java.util.Collection;

//Strategy
public interface OrderPrinter {

    void print(Collection<Order> orders);
}
