package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Еду по дороге");
    }

    @Override
    public void speed() {
        System.out.println("Везу 40 пассажиров");
    }
}
