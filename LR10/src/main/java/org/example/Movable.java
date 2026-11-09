package org.example;

public interface Movable {
    void move();
    void stop();
    double getSpeed();

    static void printSpeedLimitInfo() {
        System.out.println("60");
    }
}