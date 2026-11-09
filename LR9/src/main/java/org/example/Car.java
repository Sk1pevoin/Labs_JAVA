package org.example;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, double speed, int doors) {
        super(brand, year, speed);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println("Едет по дороге");
    }

    @Override
    public double fuelConsumption() {
        return 8.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(doors);
    }
}