package transport;

import drivers.DriverD;

public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус" + getBrand() + " остановился");

    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " остановился на пит-стопе");
    }

    @Override
    public void bestTime() {
        int minBound = 400;
        int maxBound = 450;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга авто " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 40;
        int maxBound = 100;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость автобуса " + maxSpeed);

    }
}
