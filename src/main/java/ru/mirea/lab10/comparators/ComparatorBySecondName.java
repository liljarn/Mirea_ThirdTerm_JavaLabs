package ru.mirea.lab10.comparators;

import ru.mirea.lab10.Student;

import java.util.Comparator;

public class ComparatorBySecondName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getSecondName().compareTo(s2.getSecondName());
    }
}
