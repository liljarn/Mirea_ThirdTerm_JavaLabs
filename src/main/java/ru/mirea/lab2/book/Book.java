package ru.mirea.lab2.book;

public class Book implements Comparable{
    private String author;
    private String name;
    private int year;

    public String getAuthor() {
        return author;
    }

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public int compareTo(Object obj) {
        return Integer.compare(year, ((Book)obj).getYear());
    }

    @Override
    public String toString() {
        return  "Автор книги: " + author + '\'' +
                " название книги: " + name + '\'' +
                " год издания: " + year;
    }
}
