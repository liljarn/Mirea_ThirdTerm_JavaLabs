package ru.mirea.lab4_1.task3;

public class Person {
    private String fullName = "Типичный среднестатистический человек";
    private int age = 30;

    public void move() {
        System.out.println(fullName + " двигается");
    }
    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public static void main(String[] args) {
        Person person1 = new Person("Давид", 18);
        Person person2 = new Person();

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
