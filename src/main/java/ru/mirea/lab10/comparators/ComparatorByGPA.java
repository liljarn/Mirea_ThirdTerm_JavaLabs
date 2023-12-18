package ru.mirea.lab10.comparators;

import ru.mirea.lab10.Student;
import java.util.Comparator;

public class ComparatorByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getGPA(), s1.getGPA());
    }
}