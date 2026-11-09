package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Toyota Camry", 2021, 210.0, 4));
        vehicles.add(new Car("BMW M5", 2023, 250.0, 4));
        vehicles.add(new Car("Porsche 911", 2022, 293.0, 2));

        vehicles.add(new Motorcycle("Yamaha MT-07", 2020, 200.0, false));
        vehicles.add(new Motorcycle("Ural Gear Up", 2019, 110.0, true));

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            System.out.println(vehicle.fuelConsumption());
        }
    }
}