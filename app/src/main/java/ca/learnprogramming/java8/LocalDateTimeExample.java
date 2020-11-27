package ca.learnprogramming.java8;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime now, meeting;

        System.out.println("\n==== Local Date Time Example ==");

        now = LocalDateTime.now();
        System.out.println("Now: " + now);

        meeting = LocalDateTime.of(2020, Month.DECEMBER, 18, 10, 20);
        System.out.println("Meeting: " + meeting);
        System.out.println("Meeting postponed to " + meeting.plusHours(1));
        System.out.println("Meeting hold at " + meeting.getMonth());
    }
}