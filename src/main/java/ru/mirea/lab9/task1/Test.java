package ru.mirea.lab9.task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void insertionSort(List<Student> students) {
        for (int i = 1; i < students.size(); i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getiDNumber() > key.getiDNumber()) {
                students.set(j + 1, students.get(j));
                j--;
            }
            students.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vasya", 1233, 99));
        students.add(new Student("Naruto", 7829, 5));
        students.add(new Student("Sukuna", 98130, 999));
        students.add(new Student("Gojo", 187, 1000));
        students.add(new Student("Gena", 5040, 74));
        students.add(new Student("Itadori", 678, 105));

        insertionSort(students);

        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
    }
}
