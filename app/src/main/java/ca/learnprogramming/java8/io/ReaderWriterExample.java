package ca.learnprogramming.java8.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterExample {

    public static void main(String[] args) {
        final String src = "/home/thomas/workspace/java8/gradlew";
        final String dst = "/home/thomas/workspace/java8/writer.bak";
        char[] buffer = new char[64];

        try (FileReader fr = new FileReader(src);
                FileWriter fw = new FileWriter(dst)) {

            int read = 0;
            while ((read = fr.read(buffer)) != -1) {
                System.out.println("read " + read + " bytes");
                fw.write(buffer, 0, read);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
