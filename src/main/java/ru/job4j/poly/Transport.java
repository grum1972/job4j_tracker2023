package ru.job4j.poly;

public interface Transport {
    void move();

    void passengers(int amount);

    int refill(int quantity);
}
