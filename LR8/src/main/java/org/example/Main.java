package org.example;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Бобик", 3, 12.5, "Дворняжка");
        animals[1] = new Dog("Рекс", 5, 30.0, "Овчарка");
        animals[2] = new Dog("Шарик", 2, 8.2, "Бигль");

        animals[3] = new Cat("Мурка", 4, 4.1, "Серая");
        animals[4] = new Cat("Барсик", 1, 3.5, "Рыжий");

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();

            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).purr();
            }

            System.out.println("-------------------------");
        }
    }
}