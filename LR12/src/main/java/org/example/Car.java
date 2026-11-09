package org.example;

public class Car extends Vehicle {
    private int doors;

    public Car(String name, String id, int speed, int doors) {
        super(name, id, speed);
        this.doors = doors;
    }
}