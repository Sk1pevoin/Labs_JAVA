package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movable.printSpeedLimitInfo();

        List<Movable> transportList = new ArrayList<>();

        transportList.add(new Car("Toyota", 90.0, 15.0));
        transportList.add(new Car("BMW", 120.0, 0.0));
        transportList.add(new Car("Tesla", 110.0, 50.0));
        transportList.add(new Bicycle("Trek", 25.0, 21));
        transportList.add(new Bicycle("Giant", 20.0, 18));

        for (Movable vehicle : transportList) {
            vehicle.move();
        }

        for (Movable vehicle : transportList) {
            if (vehicle instanceof Refuelable refuelableVehicle) {
                refuelableVehicle.refuel(20.0);
            }
        }

        for (Movable vehicle : transportList) {
            if (vehicle instanceof Car) {
                vehicle.move();
                vehicle.stop();
            }
        }
    }
}