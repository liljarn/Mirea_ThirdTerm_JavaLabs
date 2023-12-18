package ru.mirea.lab10;

import ru.mirea.lab10.comparators.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortingStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        setArray();
        outArray();
        System.out.print("Выберите сортировку: быструю или слиянием: ");
        String ans = in.nextLine();
        if (ans.equals("cлиянием"))
            mergeSort();
        else if (ans.equals("быстрая"))
            quickSort();
        else {
            System.out.println("Неправильно введена соритровка");
            return;
        }
        outArray();
    }
    private static Comparator<Student> comparator = new ComparatorByGPA();
    private static ArrayList<Student> iDNumber = new ArrayList<>();

    public static void setArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        in.nextLine();
        String firstName, secondName, speciality, group;
        int GPA, course;
        for (int i = 0; i< n; i++) {
            System.out.println("Заполните данные о студенте №" + (i+1));
            System.out.print("Имя: ");
            firstName = in.nextLine();
            System.out.print("Фамилия: ");
            secondName = in.nextLine();
            System.out.print("Специальность: ");
            speciality = in.nextLine();
            System.out.print("Курс: ");
            course = in.nextInt();
            in.nextLine();
            System.out.print("Группа: ");
            group = in.nextLine();
            System.out.print("Средний балл: ");
            GPA = in.nextInt();
            in.nextLine();
            iDNumber.add(new Student(firstName, secondName, speciality, course, group, GPA));
        }
    }

    public static void quickSort() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите поле, по которому будут сортироваться студенты: ");
        String choice = in.nextLine();
        switch (choice) {
            case "средний балл":
                comparator = new ComparatorByGPA();
                break;
            case "имя":
                comparator = new ComparatorByFirstName();
                break;
            case "фамилия":
                comparator = new ComparatorBySecondName();
                break;
            case "курс":
                comparator = new ComparatorByCourse();
                break;
            case "группа":
                comparator = new ComparatorByGroup();
                break;
            case "специальность":
                comparator = new ComparatorBySpeciality();
                break;
            default:
                break;
        }
        quickSortHelper(iDNumber, comparator, 0, iDNumber.size() - 1);
    }

    private static void quickSortHelper(List<Student> list, Comparator<Student> comparator, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, comparator, low, high);
            quickSortHelper(list, comparator, low, pivotIndex - 1);
            quickSortHelper(list, comparator, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Student> list, Comparator<Student> comparator, int low, int high) {
        Student pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(list.get(j), pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    public static void mergeSort() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите поле, по которому будут сортироваться студенты: ");
        String choice = in.nextLine();
        switch (choice) {
            case "средний балл":
                comparator = new ComparatorByGPA();
                break;
            case "имя":
                comparator = new ComparatorByFirstName();
                break;
            case "фамилия":
                comparator = new ComparatorBySecondName();
                break;
            case "курс":
                comparator = new ComparatorByCourse();
                break;
            case "группа":
                comparator = new ComparatorByGroup();
                break;
            case "специальность":
                comparator = new ComparatorBySpeciality();
                break;
            default:
                break;
        }
        mergeSortHelper(iDNumber, comparator);
    }
    public static void mergeSortHelper(List<Student> list, Comparator<Student> comparator) {
        if (list.size() <= 1) {
            return; // Базовый случай: если список содержит 1 элемент или пуст, то он уже отсортирован
        }

        int mid = list.size() / 2; // Найдем средний индекс
        List<Student> left = new ArrayList<>(list.subList(0, mid)); // Создаем копию левой части
        List<Student> right = new ArrayList<>(list.subList(mid, list.size())); // Создаем копию правой части

        mergeSortHelper(left, comparator); // Рекурсивно сортируем левую часть
        mergeSortHelper(right, comparator); // Рекурсивно сортируем правую часть

        merge(list, left, right, comparator); // Объединяем отсортированные части
    }

    public static void merge(List<Student> result, List<Student> left, List<Student> right, Comparator<Student> comparator) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }

    private static void swap(List<Student> list, int i, int j) {
        Student temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void outArray() {
        System.out.println("СТУДЕНТЫ --> ");
        for (Student student : iDNumber) {
            System.out.println(student.toString());
        }
    }
}