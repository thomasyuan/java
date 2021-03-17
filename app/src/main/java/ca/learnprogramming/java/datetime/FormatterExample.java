package ca.learnprogramming.java.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormatterExample {

    public static void main(String[] args) {
        System.out.println("\n==== Formatter Example ====");

        String dateFormat = "MMM dd, yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        System.out.println(formatter.format(LocalDateTime.now()));


        formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 H时mm分ss秒");
        System.out.println(formatter.format(LocalDateTime.now()));
        System.out.println(formatter.format(LocalDateTime.of(2020, 1, 1, 18, 20, 8)));

        // Period, for date
        Period between = Period.between(LocalDate.of(2012, 9, 9), LocalDate.of(2019, 4, 24));
        System.out.println("Austin比Andrew大" + between.getYears() +
                "年" + between.getMonths() + "个月零" + between.getDays() + "天");

        // Duration, for time
        Duration duration = Duration.ofHours(1);
        System.out.println("Duration " + duration.getSeconds());

        duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        System.out.println("Duration " + duration + ", " + duration.getSeconds() + " seconds");

        duration = Duration.between(LocalTime.of(1, 10, 30), LocalTime.of(2, 20, 00));
        System.out.println("Duration " + duration + ", " + duration.getSeconds() + " seconds");
        duration = Duration.between(LocalTime.of(10, 10, 30), LocalTime.of(2, 20, 00));
        System.out.println("Duration " + duration + ", " + duration.getSeconds() + " seconds");

        System.out.println("Instant now: " + Instant.now());
        System.out.println("Instant now: " + Instant.now());

    }
}
