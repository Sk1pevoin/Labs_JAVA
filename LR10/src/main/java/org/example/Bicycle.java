package org.example;

public class Bicycle implements Movable, Refuelable {
    private String brand;
    private double speed;
    private int gearCount;

    public Bicycle(String brand, double speed, int gearCount) {
        this.brand = brand;
        this.speed = speed;
        this.gearCount = gearCount;
    }

    @Override
    public void move() {
        System.out.println(brand + " " + speed + " " + gearCount);
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
        System.out.println(brand);
    }

    @Override
    public double getFuelLevel() {
        return 0.0;
    }

    public String getBrand() {
        return brand;
    }

    public int getGearCount() {
        return gearCount;
    }
}