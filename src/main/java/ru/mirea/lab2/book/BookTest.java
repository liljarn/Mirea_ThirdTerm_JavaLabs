package ru.mirea.lab2.book;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookShelf bookShelf = new BookShelf();
        System.out.print("Введите количество книг: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String author, name;
        int year;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите автора книги: ");
            author = scanner.nextLine();
            System.out.print("Введите название книги: ");
            name = scanner.nextLine();
            System.out.print("Введите год издания книги: ");
            year = scanner.nextInt();
            scanner.nextLine();
            Book book = new Book(author, name, year);
            bookShelf.add(book);
        }
        System.out.println("Изданна позже всех: " + bookShelf.getEarly());
        System.out.println("Изданна раньше всех: " + bookShelf.getLast());
        bookShelf.sortBooks();
        System.out.println(bookShelf);
    }
}
