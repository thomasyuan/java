package ca.learnprogramming.java8.collections;

import java.util.ArrayList;
import ca.learnprogramming.java8.common.*;

public class ArrayListTest {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Austin"));
        students.add(0, new Student("Andrew"));

        students.forEach((student) -> System.out.println(student));
    }

}
