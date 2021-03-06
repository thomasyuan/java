package ca.learnprogramming.java8.collections;

import java.util.Arrays;
import ca.learnprogramming.java8.common.*;

public class ArrayTest {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Austin");
        students[1] = new Student("Andrew");

        System.out.println(Arrays.toString(students));
    }
}
