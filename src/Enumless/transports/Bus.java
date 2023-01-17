package Enumless.transports;

import oop.drivers.DriverD;

public class Bus extends Transport<DriverD> {
    public enum Capacity {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        private final Integer minCapacity;
        private final Integer maxCapacity;

        Capacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        @Override
        public String toString() {
            return String.format("Вместимость: %s %s", (minCapacity != null ? "от " + minCapacity + " человек" : ""),
                    maxCapacity != null ? "до " + maxCapacity + " человек" : "");
        }
    }
    private Capacity capacity;


    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity=capacity;
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
    @Override
    public void printType() {
        if (capacity==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {System.out.println("Кузов: " + capacity);}

    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
