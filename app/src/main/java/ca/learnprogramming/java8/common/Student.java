package ca.learnprogramming.java8.common;

public class Student {
    private final String mName;

    public Student(final String name) {
        mName = name;
    }

    @Override
    public String toString() {
        return mName;
    }
}
