package ca.learnprogramming.java8.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// To run this example, `./gradlew run` doesn't work, it won't wait for user's input.
// Try `java -cp app/build/classes/java/main/ ca.learnprogramming.java8.io.ConsoleExample`
public class ConsoleExample {

    public static void main(String[] args) {

        String s = "";

        System.out.println("\n==== Console IO Example ====");
        System.out.println("Type 'exit' to quit");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            s = br.readLine();
            while (s != null) {
                if (s.equals("exit")) {
                    System.exit(0);
                }
                System.out.println("Read: " + s.trim());
                s = br.readLine();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
