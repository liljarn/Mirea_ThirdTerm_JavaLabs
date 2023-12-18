package ru.mirea.lab7.task7_9;

public class Journal implements Printable {
    private String release;
    private String name;
    private int price;

    public Journal(String release, String name, int price) {
        this.release = release;
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + '"' + " " + name + ", номер выпуска: " + release + ", цена: " + price);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable printab: printable) {
            if (printab instanceof Journal)
                printab.print();
        }
    }
}
