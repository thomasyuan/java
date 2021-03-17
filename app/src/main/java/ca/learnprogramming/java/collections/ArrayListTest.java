package ca.learnprogramming.java.collections;

import java.util.ArrayList;
import ca.learnprogramming.java.common.*;

public class ArrayListTest {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Austin"));
        students.add(0, new Student("Andrew"));

        students.forEach((student) -> System.out.println(student));
    }

}
