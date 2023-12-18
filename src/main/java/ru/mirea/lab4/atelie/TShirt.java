package ru.mirea.lab4.atelie;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMan() {
        System.out.println("Футболка мужская: " +
                "размрер - "+ size + ", цена - " + cost + ", цвет - " + colour);
    }

    @Override
    public void dressWoman() {

        System.out.println("Футболка женская: " +
                "размрер - "+ size + ", цена - " + cost + ", цвет - " + colour);
    }

    public TShirt(Size size, int cost, String colour) {
        this.size = size;
        this.cost = cost;
        this.colour = colour;
    }

}
