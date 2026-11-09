package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, int x, int y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw(double thickness) {
        System.out.println("Рисую круг толщиной " + thickness);
    }
}