package org.example;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String name, String id, int speed, boolean hasSidecar) {
        super(name, id, speed);
        this.hasSidecar = hasSidecar;
    }
}