package ru.mirea.lab19.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortingStudentsByGpa {
    private final List<Student> studentList;

    public SortingStudentsByGpa() {
        studentList = new ArrayList<>();
    }

    public void setArray(List<Student> students) {
        studentList.addAll(students);
    }

    public void quicksort() {
        studentList.sort((s1, s2) -> Double.compare(s2.gpa(), s1.gpa()));
    }

    public void quicksortByField(Comparator<Student> comparator) {
        studentList.sort(comparator);
    }

    public void outArray() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : studentList) {
            if ((student.firstName() + " " + student.lastName()).equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден.");
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Иван", "Иванов", "Информатика", 3, "Группа1", 4.5));
        students1.add(new Student("Петр", "Петров", "Математика", 2, "Группа2", 3.8));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Анна", "Смирнова", "Физика", 4, "Группа3", 4.9));
        students2.add(new Student("Алексей", "Сидоров", "Химия", 3, "Группа1", 4.2));

        SortingStudentsByGpa system = new SortingStudentsByGpa();
        system.setArray(students1);

        try {
            Student student = system.findStudentByFullName("Иван Иванов");
            System.out.println("Найден студент: " + student);
        } catch (StudentNotFoundException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            Student student = system.findStudentByFullName("Какой-то Чел");
            System.out.println("Найден студент: " + student);
        } catch (StudentNotFoundException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        system.quicksort();

        System.out.println("\nСортировка по среднему баллу:");
        system.outArray();

        System.out.println("\nДобавляем еще студентов и сортируем по имени:");
        system.setArray(students2);
        system.quicksortByField(Comparator.comparing(Student::firstName));
        system.outArray();
    }
}