package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Лечу по небу");
    }

    @Override
    public void speed() {
        System.out.println("Перевожу 300 пассажиров");
    }
}
