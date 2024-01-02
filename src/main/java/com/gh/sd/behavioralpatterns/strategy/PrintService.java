package com.gh.sd.behavioralpatterns.strategy;


import java.util.LinkedList;

//Context 
public class PrintService {

    private final OrderPrinter printer;

    /**
     * Default constructor with a {@link OrderPrinter}
     */
    public PrintService() {
        this.printer = new DetailPrinter();
    }

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
