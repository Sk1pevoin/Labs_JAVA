package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Vehicle> vehicleMap = new HashMap<>();

        Car car1 = new Car("Toyota Camry", "C001", 200, 4);
        Car car2 = new Car("BMW X5", "C002", 240, 5);
        Car car3 = new Car("Audi A4", "C003", 220, 4);

        vehicleMap.put(car1.getName(), car1);
        vehicleMap.put(car2.getName(), car2);
        vehicleMap.put(car3.getName(), car3);

        Truck truck1 = new Truck("Volvo FH16", "T001", 110, 20.5);
        Truck truck2 = new Truck("Kamaz 5490", "T002", 90, 15.0);
        Truck truck3 = new Truck("Scania R500", "T003", 100, 18.0);

        vehicleMap.put(truck1.getName(), truck1);
        vehicleMap.put(truck2.getName(), truck2);
        vehicleMap.put(truck3.getName(), truck3);

        Motorcycle moto1 = new Motorcycle("Yamaha R1", "M001", 299, false);
        Motorcycle moto2 = new Motorcycle("Ural", "M002", 110, true);

        vehicleMap.put(moto1.getName(), moto1);
        vehicleMap.put(moto2.getName(), moto2);

        for (Map.Entry<String, Vehicle> entry : vehicleMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}