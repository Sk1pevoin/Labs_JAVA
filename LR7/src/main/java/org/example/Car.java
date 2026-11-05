package org.example;

public class Car {
    private String model;
    private int year;
    private int horsePower;

    private static int totalCars = 0;
    private static int totalHorsePower = 0;

    public Car(String model, int year, int horsePower) {
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;

        totalCars++;
        totalHorsePower += horsePower;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static int getTotalHorsePower() {
        return totalHorsePower;
    }

    public static double getAveragePower() {
        if (totalCars == 0) {
            return 0;
        }
        return (double) totalHorsePower / totalCars;
    }
}