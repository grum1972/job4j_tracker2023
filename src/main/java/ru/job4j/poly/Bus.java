package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("автобус поехал");
    }

    @Override
    public void passengers(int amount) {
        System.out.println("Автобус везет " + amount + " пассажиров");
    }

    @Override
    public int refill(int quantity) {
        return quantity * 50;
    }
}
