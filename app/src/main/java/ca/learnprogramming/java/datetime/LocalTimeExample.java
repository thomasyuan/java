package ca.learnprogramming.java.datetime;

import static java.time.temporal.ChronoUnit.*;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime now, lunchTime, bedTime;

        System.out.println("\n==== Local Time Example ====");

        now = LocalTime.now();
        System.out.println("Now: " + now);
        System.out.println("After 1 hour and 30 minutes: " + now.plusHours(1).plusMinutes(30));
        System.out.println("Minutes of hour: " + now.truncatedTo(MINUTES));

        lunchTime = LocalTime.of(12, 00);
        System.out.println("Lunch time is " + lunchTime);
        System.out.println("Lunch time is in the future? " + lunchTime.isAfter(now));

        bedTime = LocalTime.of(22, 30);
        System.out.println("Bed time is " + bedTime);
        System.out.println("Should I sleep already? " + bedTime.isBefore(now));
        if (bedTime.isAfter(now)) {
            System.out.println("It's " + now.until(bedTime, MINUTES) + " minutes to sleep");
        } else {
            System.out.println("You should on bed " + bedTime.until(now, HOURS) + " hours ago");
        }
    }
}
