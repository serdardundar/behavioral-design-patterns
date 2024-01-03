package com.gh.sd.behavioralpatterns.observer;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("100");

        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

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
    }
}
