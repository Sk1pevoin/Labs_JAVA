package org.example;

public class Car implements Movable, Refuelable {
    private String brand;
    private double speed;
    private double fuelLevel;

    public Car(String brand, double speed, double fuelLevel) {
        this.brand = brand;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void move() {
        if (fuelLevel > 0) {
            System.out.println(brand + " " + speed + " " + fuelLevel);
        } else {
            System.out.println(brand + " 0");
        }
    }

    @Override
    public void stop() {
        System.out.println(brand);
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println(brand + " " + fuelLevel);
        }
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }

    public String getBrand() {
        return brand;
    }
}