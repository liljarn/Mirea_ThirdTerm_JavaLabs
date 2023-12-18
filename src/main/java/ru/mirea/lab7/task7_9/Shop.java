package ru.mirea.lab7.task7_9;

import static ru.mirea.lab7.task7_9.Book.printBooks;
import static ru.mirea.lab7.task7_9.Journal.printMagazines;

public class Shop implements Printable {
    private Printable[] printables = new Printable[5];
    @Override
    public void print() {
        System.out.println("АССОРТИМЕНТ МАГАЗИНА:");
        for (Printable printab: printables) {
            printab.print();
        }
    }

    public Shop() {
        Book book1 = new Book("Властелин колец", "Дж.Р.Р. Толкин", "29 июля 1954г.", 750);
        printables[0] = book1;
        Book book2 = new Book("Преступление и наказание", "Ф.М. Достоевский", "1866г.", 500);
        printables[1] = book2;
        Book book3 = new Book("Так говорил Заратустра", "Фридрих Ницше", "1885г.", 10000);
        printables[2] = book3;
        Journal journal1 = new Journal("Выпуск от 16 мая 1924г.", "Мурзилка", 67);
        printables[3] = journal1;
        Journal journal2 = new Journal("Выпуск от 16 марта 2010г.", "Черепашки ниндзя. Боевая четвёрка", 220);
        printables[4] = journal2;
        System.out.println("Вывод журналов");
        printMagazines(printables);
        System.out.println("____________________________________________");
        System.out.println("Вывод книг");
        printBooks(printables);
    }

    public static void main(String[] args) {
        new Shop();
    }
}
