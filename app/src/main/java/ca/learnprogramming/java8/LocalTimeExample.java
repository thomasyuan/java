package ca.learnprogramming.java8;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime now;

        System.out.println("\n==== Local Time Example ====");

        now = LocalTime.now();
        System.out.println("Now: " + now);
    }
}
