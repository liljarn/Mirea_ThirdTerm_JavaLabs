package ru.mirea.lab4.atelie;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMan() {
        System.out.println("Штаны мужские: " +
                "размрер - "+ size + ", цена - " + cost + ", цвет - " + colour);
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны женские: " +
                "размрер - "+ size + ", цена - " + cost + ", цвет - " + colour);
    }

    public Pants(Size size, int cost, String colour) {
        this.size = size;
        this.cost = cost;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size + " (" + size.getDescription() + ")" +
                ", cost=" + cost +
                ", colour='" + colour + '\'' +
                '}';
    }
}