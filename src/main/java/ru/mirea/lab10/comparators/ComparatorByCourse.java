package ru.mirea.lab10.comparators;

import ru.mirea.lab10.Student;

import java.util.Comparator;

public class ComparatorByCourse implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCourse(), o2.getCourse());

    }
}
