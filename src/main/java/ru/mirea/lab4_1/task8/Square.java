package ru.mirea.lab4_1.task8;



public class Square extends Rectangle {
    public Square() {
    }

    public Square(double a) {
        super(a, a);
    }

    public Square(double a, String color, boolean filled) {
        super( a, a, color, filled);
    }
    @Override
    public double getPerimeter() {
        return 4*super.getWidth();
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double a) {
        super.setLength(a);
        super.setWidth(a);
    }

    public void setWidth(double a) {
        super.setWidth(a);
    }
    public void setLength(double a) {
        super.setLength(a);
    }

    @Override
    public String toString() {
        return "Квадрат {" +
                "сторона = " + super.getWidth() +
                ", площадь = " + getArea() +
                ", периметр = " + getPerimeter() +
                ", цвет = " + getColor() +
                ", заполненный цветом = " + isFilled() +
                '}';
    }

}
