package ru.mirea.lab4.atelie;

public class Tie extends Clothes implements MenClothing{
    @Override
    public void dressMan() {
        System.out.println("Галстук: " +
                "размрер - "+ size + ", цена - " + cost + ", цвет - " + colour);
    }

    public Tie(Size size, int cost, String colour) {
        this.size = size;
        this.cost = cost;
        this.colour = colour;
    }

}