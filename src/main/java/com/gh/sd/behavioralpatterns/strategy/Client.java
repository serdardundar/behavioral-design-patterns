package com.gh.sd.behavioralpatterns.strategy;

import java.util.LinkedList;

public class Client {

    private static final LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();
        //print all orders
        PrintService defaultPrintService = new PrintService();
        defaultPrintService.printOrders(orders);

        PrintService summaryPrinter = new PrintService(new SummaryPrinter());
        summaryPrinter.printOrders(orders);

        PrintService detailPrinter = new PrintService(new DetailPrinter());
        detailPrinter.printOrders(orders);
    }

    private static void createOrders() {
        Order o = new Order("100");
        o.addItem("Soda", 2);
        o.addItem("Chips", 10);
        orders.add(o);

        o = new Order("200");
        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orders.add(o);
    }
}
