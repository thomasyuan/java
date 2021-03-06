package ca.learnprogramming.java8.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamExample {

    public static void main(String[] args) {

        final String src = "/home/thomas/workspace/java8/gradlew";
        final String dst = "/home/thomas/workspace/java8/iostream.bak";
        byte[] buffer = new byte[1024];

        System.out.println("\n==== Input/Output Stream Example ====");
        System.out.println("copy gradlew iostream.bak");

        try (FileInputStream fis = new FileInputStream(src);
                FileOutputStream fos = new FileOutputStream(dst)) {

            System.out.println("File size: " + fis.available() + " bytes.");

            int read = 0;
            while ((read = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
