package transport;

import drivers.DriverC;

public class Truck extends Transport<DriverC> {


    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик " + getBrand() + " остановился");

    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " остановился на пит-стопе");

    }

    @Override
    public void bestTime() {
        int minBound = 400;
        int maxBound = 450;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга Грузовика " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 60;
        int maxBound = 100;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость Грузовика " + maxSpeed);

    }
}
