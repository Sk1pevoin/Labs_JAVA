package org.example;

public class Truck extends Vehicle {
    private double capacity;

    public Truck(String name, String id, int speed, double capacity) {
        super(name, id, speed);
        this.capacity = capacity;
    }
}