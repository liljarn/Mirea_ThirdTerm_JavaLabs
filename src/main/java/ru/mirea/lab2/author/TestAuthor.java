package ru.mirea.lab2.author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String ans;
        String email;
        Scanner scanner = new Scanner(System.in);
        Author author = new Author("shadowraze", "shadowraze@email.zxc", 'm');
        System.out.println("Имя автора: " + author.getName());
        System.out.println("Почта автора: " + author.getEmail());
        System.out.println("Пол автора: " + author.getGender());
        System.out.print("Хотите поменять адрес почты? Если да, то введите yes ");
        ans = scanner.nextLine();
        if (ans.equals("yes")) {
            System.out.print("Введите новую почту: ");
            email = scanner.nextLine();
            author.setEmail(email);
            System.out.println("Почта автора была изменена на: " + author.getEmail());
        }
        else
            System.out.println("Изменения не произошли");
        System.out.print("Все данные об авторе: " + author);
    }
}
