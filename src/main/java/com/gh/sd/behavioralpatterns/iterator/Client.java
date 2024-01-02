package com.gh.sd.behavioralpatterns.iterator;

public class Client {

    public static void main(String[] args) {
        Iterator<ThemeColor> iterator = ThemeColor.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
