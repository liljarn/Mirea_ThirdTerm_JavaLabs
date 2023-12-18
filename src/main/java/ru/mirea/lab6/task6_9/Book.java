package ru.mirea.lab6.task6_9;

public class Book implements Printable{
    private String name;
    private String author;
    private String date;
    private int price;

    public Book(String name, String author, String date, int price) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + '"' + name + '"' + ", автор: " + author + ", год выпуска: " + date + ", цена: " + price);
    }
}
