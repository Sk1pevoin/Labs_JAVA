package org.example;

public class Vehicle {
    protected String name;
    protected String id;
    protected int speed;

    public Vehicle(String name, String id, int speed) {
        this.name = name;
        this.id = id;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }
}