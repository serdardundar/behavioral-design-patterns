package com.gh.sd.behavioralpatterns.state;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.cancel();
        order.processed();

        System.out.println("--------------------------------");

        order.dispatched();
        order.processed();
        order.cancel();

        System.out.println("--------------------------------");

        order.paymentSuccessful();
        order.processed();
        order.cancel();
        order.processed();

        System.out.println("--------------------------------");

        order.delivered();
        order.processed();
        order.cancel();
    }
}
