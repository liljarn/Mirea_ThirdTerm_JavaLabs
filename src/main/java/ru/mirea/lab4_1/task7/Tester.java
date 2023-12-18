package ru.mirea.lab4_1.task7;

public class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new SchoolStudent("Иван Золо"), new SchoolStudent("Илья Хакимов"), new UniversityStudent("Илья Коробкин"), new UniversityStudent("Евгений Поздняков"), new SchoolStudent("Миша Беляев")};
        System.out.print("Студенты: ");
        for (Student student : students) {
            if (student instanceof UniversityStudent)
                System.out.print(student.name + ", ");
        }
        System.out.println();
        System.out.print("Школьники: ");
        for (Student student : students) {
            if (student instanceof SchoolStudent)
                System.out.print(student.name + ", ");
        }
    }
}