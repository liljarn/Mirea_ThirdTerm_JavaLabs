package ru.mirea.lab9.task2;
import ru.mirea.lab9.task1.Student;

import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return -1 * (o1.getScore() - o2.getScore());
    }
    public static void sort(List<Student> students) {
        QuickSort.quickSort(students, new SortingStudentsByGPA());
    }
}
