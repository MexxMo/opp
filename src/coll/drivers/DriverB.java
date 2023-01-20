package coll.drivers;

public class DriverB extends Driver {
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
