package com.gh.sd.behavioralpatterns.state;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.cancel();

        System.out.println("--------------------------------");

        order.dispatched();
        order.cancel();

        System.out.println("--------------------------------");

        order.paymentSuccessful();
        order.cancel();

        System.out.println("--------------------------------");

        order.delivered();
        order.cancel();
    }
}
