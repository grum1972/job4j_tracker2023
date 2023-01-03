package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle plane = new Airplane();
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bus;
        vehicles[1] = train;
        vehicles[2] = plane;
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.speed();
        }
    }
}
