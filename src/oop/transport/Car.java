package oop.transport;

import oop.drivers.DriverB;

public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп авто" + getBrand());

    }

    @Override
    public void bestTime() {
        int minBound = 200;
        int maxBound = 250;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга авто " + bestTime);
    }


    @Override
    public void maxSpeed() {
        int minBound = 200;
        int maxBound = 250;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость авто " + maxSpeed);

    }
}
