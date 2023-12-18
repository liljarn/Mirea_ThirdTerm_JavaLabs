package ru.mirea.lab24.task2;

public class Client {
    public void sit(Chair chair) {
        System.out.println("Клиент сел на стул.");
        chair.sitOn();
    }
}
