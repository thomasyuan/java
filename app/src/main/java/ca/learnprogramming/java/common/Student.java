package ca.learnprogramming.java.common;

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
