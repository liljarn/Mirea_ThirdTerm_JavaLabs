package ru.mirea.lab9.task2;

import ru.mirea.lab9.task1.Student;

import java.util.ArrayList;
import java.util.List;

import static ru.mirea.lab9.task2.SortingStudentsByGPA.sort;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vasya", 1233, 99));
        students.add(new Student("Naruto", 7829, 5));
        students.add(new Student("Sukuna", 98130, 999));
        students.add(new Student("Gojo", 187, 1000));
        students.add(new Student("Gena", 5040, 74));
        students.add(new Student("Itadori", 678, 105));

        sort(students);

        for (Student student : students) System.out.println(student);
    }
}
