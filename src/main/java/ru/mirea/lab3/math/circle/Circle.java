package ru.mirea.lab3.math.circle;

public class Circle implements Comparable<Circle>{
    static private final double PI = Math.PI;
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double length() {
        return 2 * PI * radius;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
    @Override
    public int compareTo(Circle circle) {
        return Double.compare(radius, circle.radius);
    }

    @Override
    public String toString() {
        return "Окружность: " +
                "радиус = " + radius +
                ", центр окружности = " + center;
    }
}
