package ru.mirea.lab13.task2;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр");
        Person person3 = new Person("Сидоров");

        System.out.println(person1.getFullName()); // Выводит "Иванов И.И."
        System.out.println(person2.getFullName()); // Выводит "Петров П."
        System.out.println(person3.getFullName()); // Выводит "Сидоров"
    }
}
