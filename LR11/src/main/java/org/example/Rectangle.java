package org.example;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, int x, int y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public void draw(boolean filled) {
        System.out.println("Рисую прямоугольник с заливкой: " + filled);
    }
}