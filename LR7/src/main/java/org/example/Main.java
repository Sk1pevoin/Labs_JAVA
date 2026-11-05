package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 2020, 181);
        Car car2 = new Car("BMW X5", 2019, 340);
        Car car3 = new Car("Lada Vesta", 2021, 106);
        Car car4 = new Car("Audi A6", 2018, 245);
        Car car5 = new Car("Kia Rio", 2022, 123);

        System.out.println("Создано автомобилей: " + Car.getTotalCars());
        System.out.println("Суммарная мощность: " + Car.getTotalHorsePower() + " л.с.");
        System.out.printf("Средняя мощность: %.2f л.с.%n", Car.getAveragePower());
    }
}