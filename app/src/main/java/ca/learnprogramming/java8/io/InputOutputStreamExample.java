package ca.learnprogramming.java8.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputOutputStreamExample {

    public static void main(String[] args) {

        final String src = "/home/thomas/workspace/java8/gradlew";
        final String dst = "/home/thomas/workspace/java8/iostream.bak";
        byte[] buffer = new byte[64];

        try (FileInputStream fis = new FileInputStream(src);
                FileOutputStream fos = new FileOutputStream(dst)) {

            System.out.println("File size: " + fis.available() + " bytes.");

            int read = 0;
            while ((read = fis.read(buffer)) != -1) {
                System.out.println("read " + read + " bytes");
                fos.write(buffer, 0, read);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
