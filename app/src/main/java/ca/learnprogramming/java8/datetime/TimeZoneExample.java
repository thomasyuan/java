package ca.learnprogramming.java8.datetime;

import static java.time.temporal.ChronoUnit.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZoneExample {

    public static void main(String[] args) {
        System.out.println("\n==== Time Zone Example ====");

        ZoneId BEIJING = ZoneId.of("Asia/Shanghai");
        ZonedDateTime beijing = ZonedDateTime.now(BEIJING);

        ZoneId EAST = ZoneId.of("America/Toronto");
        ZonedDateTime toronto = ZonedDateTime.now(EAST);

        System.out.println("EAST : " + toronto);
        System.out.println("Beijing: " + beijing);
        System.out.println("Beijing: " + ZonedDateTime.of(LocalDateTime.now(), BEIJING));

        ZoneOffset offset = ZoneOffset.ofHours(2);
        System.out.println("Offset: " + offset);

        ZonedDateTime ac32Departure = ZonedDateTime.of(2020, 8, 8, 19, 05, 0, 0, BEIJING);
        ZonedDateTime ac32Arrival = ZonedDateTime.of(2020, 8, 8, 18, 40, 0, 0, EAST);

        System.out.println("AC32 Departure: " + ac32Departure);
        System.out.println("AC32 Arrival  : " + ac32Arrival);
        long minutes = ac32Departure.until(ac32Arrival, MINUTES);

        System.out.println("Flight time: " + minutes / 60 + " hours " + minutes % 60 + " minutes");
    }
}