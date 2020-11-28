package ca.learnprogramming.java8;

import ca.learnprogramming.java8.datetime.*;
import ca.learnprogramming.java8.io.*;

public class App {

    public static void main(String[] args) {

        System.out.println("#### Learn Programming - Java8 ####");

        LocalDateExample.main(null);
        LocalTimeExample.main(null);
        LocalDateTimeExample.main(null);
        TimeZoneExample.main(null);
        FormatterExample.main(null);

        InputOutputStreamExample.main(null);
        ReaderWriterExample.main(null);
    }
}
