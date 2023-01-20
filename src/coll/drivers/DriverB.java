package coll.drivers;

import coll.transports.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String name, boolean license, int driverExperience) {
        super(name, license, driverExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель автомобиля " + getName() + " начал движение");
    }

    @Override
    public void FinishMove() {
        System.out.println("Водитель автомобиля " + getName() + " закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водитель автомобиля " + getName() + " заправляет автомобиль");

    }


}
