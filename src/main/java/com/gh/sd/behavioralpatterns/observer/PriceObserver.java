package com.gh.sd.behavioralpatterns.observer;

//Concrete observer
public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double total = order.getItemCost();
        if (total >= 500) {
            order.setDiscount(50);
        } else if (total >= 200) {
            order.setDiscount(10);
        }
    }
}
