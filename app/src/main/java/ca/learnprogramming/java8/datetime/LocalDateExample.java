package ca.learnprogramming.java8.datetime;

import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate now, birthday, oneMonthLater, nextFriday;

        System.out.println("\n==== Local Date Example ====");

        now = LocalDate.now();
        System.out.println("Now: " + now);

        birthday = LocalDate.of(2012, 9, 9);
        System.out.println("Birthday: " + birthday);
        System.out.println("Birthday day of week: " + birthday.getDayOfWeek());
        System.out.println("Birthday day of month: " + birthday.getDayOfMonth());
        System.out.println("Birthday day of year: " + birthday.getDayOfYear());
        System.out.println("Birthday is leap year? " + birthday.isLeapYear());
        System.out.println("Is birthday in the past? " + birthday.isBefore(now));

        oneMonthLater = now.plusMonths(1);
        System.out.println("One month laster: " + oneMonthLater);

        nextFriday = now.with(next(FRIDAY));
        System.out.println("Next Friday: " + nextFriday);
    }
}
