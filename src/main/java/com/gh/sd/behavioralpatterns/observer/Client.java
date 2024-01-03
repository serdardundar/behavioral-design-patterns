package com.gh.sd.behavioralpatterns.observer;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("100");

        QuantityObserver quantityObserver = new QuantityObserver();
        PriceObserver priceObserver = new PriceObserver();

        order.attach(quantityObserver);
        order.attach(priceObserver);

        order.addItem(100);
        System.out.println(order);
        System.out.println("********************************");
        order.addItem(50);
        System.out.println(order);
        System.out.println("********************************");
        order.addItem(100);
        System.out.println(order);
        System.out.println("********************************");
        order.addItem(60);
        System.out.println(order);
        System.out.println("********************************");
        order.addItem(40);
        System.out.println(order);
        System.out.println("********************************");
        order.addItem(170);
        System.out.println(order);
        System.out.println("********************************");
        order.addItem(130);
        System.out.println(order);

        order.detach(quantityObserver);

        System.out.println("********************************");

        //Shipping cost will not change anymore
        order.addItem(50);
        System.out.println(order);
        System.out.println("********************************");
    }
}
