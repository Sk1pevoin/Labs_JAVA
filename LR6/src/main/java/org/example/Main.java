package org.example;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Ноутбук", 55999.99, 3);

        System.out.println("Товар: " + product.getName());
        System.out.println("Цена: " + product.getPrice());
        System.out.println("Количество: " + product.getQuantity());
        System.out.println("Общая стоимость: " + product.totalCost());
    }
}