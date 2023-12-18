package ru.mirea.lab4.atelie;

public class Skirt extends Clothes implements WomenClothing {
    @Override
    public void dressWoman() {
        System.out.println("Юбка: " +
                "размрер - "+ size + ", цена - " + cost + ", цвет - " + colour);
    }

    public Skirt(Size size, int cost, String colour) {
        this.size = size;
        this.cost = cost;
        this.colour = colour;
    }
}