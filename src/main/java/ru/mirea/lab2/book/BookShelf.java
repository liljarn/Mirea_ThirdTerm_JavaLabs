package ru.mirea.lab2.book;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<>();
    private int amountBooks = 0;

    public Book getLast() {
        Book book = null;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < books.size();i++) {
            int year = books.get(i).getYear();
            if (year < min) {
                min = year;
                book = books.get(i);
            }
        }
        return book;
    }

    public void add(Book book) {
        books.add(book);
        amountBooks++;
    }

    public Book getEarly(){
        Book book = null;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < books.size(); i++) {
            int year = books.get(i).getYear();
            if (year > max) {
                max = year;
                book = books.get(i);
            }
        }
        return book;
    }

    public void sortBooks(){
        books.sort(Book::compareTo);
    }

    @Override
    public String toString() {
        return "Cписок книг: " + books +
                ", количество книг" + amountBooks;
    }
}

