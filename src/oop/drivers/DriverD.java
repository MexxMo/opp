package oop.drivers;

public class DriverD extends Driver {
    public DriverD(String name, boolean license, int driverExperience) {
        super(name, license, driverExperience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель автобуса " + getName() + " начал движение");
    }

    @Override
    public void FinishMove() {
        System.out.println("Водитель автобуса " + getName() + " закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водитель автобуса " + getName() + " автобус автомобиль");

    }
}
