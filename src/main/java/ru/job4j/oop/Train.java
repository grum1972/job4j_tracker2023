package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Еду по рельсам");
    }

    @Override
    public void speed() {
        System.out.println("Везу 1000 пассажиров");
    }
}
