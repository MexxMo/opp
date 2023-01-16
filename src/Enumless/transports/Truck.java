package Enumless.transports;

import oop.drivers.DriverC;

public class Truck extends Transport<DriverC> {

    public Truck(String brand, String model, double engineVolume, DriverC driver,CarryingCapacity carrying) {
        super(brand, model, engineVolume, driver);
        this.carrying=carrying;
    }

    public enum CarryingCapacity {
        N1(null, 3.5),
        N2(3.5, 12.0),
        N3(12.0, null);


        private final Double minValue;
        private final Double maxValue;

        CarryingCapacity(Double minValue, Double maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;

        }

        @Override
        public String toString() {
            return String.format("Грузоподъёмность: %s %s", (minValue != null ? "от " + minValue + " тонн" : ""),
                    maxValue != null ? "до " + maxValue + " тонн" : "");
        }
    }
    private CarryingCapacity carrying;


    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик " + getBrand() + " остановился");

    }

    @Override
    public void printType() {
        if (carrying==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println("Грузоподъемность " + carrying);}

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

    public CarryingCapacity getCarrying() {
        return carrying;
    }

    public void setCarrying(CarryingCapacity carrying) {
        this.carrying = carrying;
    }
}
