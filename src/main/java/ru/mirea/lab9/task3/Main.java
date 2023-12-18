package ru.mirea.lab9.task3;

import ru.mirea.lab9.task1.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ru.mirea.lab9.task1.Test.insertionSort;

public class Main {
    public static void main(String[] args) {
        List<Student> list1 = Arrays.asList(
                new Student("aboba",12, 66),
                new Student("bebra",54, 22),
                new Student("cringe",65, 19)
        );

        List<Student> list2 = Arrays.asList(
                new Student("rashid",19, 21),
                new Student("gajimurad",67, 88));

        List<Student> mergedList = merge(list1, list2);

        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> merge(List<Student> students1, List<Student> students2) {
        Sort helper = new Sort();
        insertionSort(students1);
        insertionSort(students2);

        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < students1.size() && j < students2.size()) {

            if (helper.compare(students1.get(i), students2.get(j)) < 0) {
                mergedList.add(students1.get(i));
                i++;
            }
            else {
                mergedList.add(students2.get(j));
                j++;
            }
        }

        while (i < students1.size()) {
            mergedList.add(students1.get(i));
            i++;
        }

        while (j < students2.size()) {
            mergedList.add(students2.get(j));
            j++;
        }

        return mergedList;
    }
}