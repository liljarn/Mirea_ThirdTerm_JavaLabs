package ru.mirea.lab4_1.task8;

public abstract class Shape {
    protected String color = "black";
    protected boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Фигура {" +
                "color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}
