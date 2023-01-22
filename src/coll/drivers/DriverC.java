package coll.drivers;

import coll.transports.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String name, boolean license, int driverExperience) {
        super(name, license, driverExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель грузовика "+getName()+" начал движение");
    }

    @Override
    public void finishMove() {System.out.println("Водитель грузовика "+getName()+" закончил движение");

    }

    @Override
    public void refill() {System.out.println("Водитель грузовика "+getName()+" заправляет грузовик");

    }
}
