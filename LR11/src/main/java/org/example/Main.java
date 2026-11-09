package org.example;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle("Red", 10, 20, 5.0);

        shape.draw();
        shape.draw("Blue");
        shape.draw(15);

        System.out.println(shape.calculateArea());

        Shape[] shapes = new Shape[] {
                new Circle("Red", 0, 0, 3.0),
                new Rectangle("Green", 1, 1, 4.0, 5.0)
        };

        for (Shape s : shapes) {
            s.draw();
            System.out.println(s.calculateArea());
        }
    }
}