package ca.learnprogramming.java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterExample {

    public static void main(String[] args) {

        final String src = "/home/thomas/workspace/java/gradlew";
        final String dst = "/home/thomas/workspace/java/writer.bak";
        char[] buffer = new char[1024];

        System.out.println("\n==== Reader/Writer Example ====");
        System.out.println("copy gradlew writer.bak");

        try (FileReader fr = new FileReader(src);
                FileWriter fw = new FileWriter(dst)) {

            int read = 0;
            while ((read = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, read);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
