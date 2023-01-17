package tryy;

import tryy.drivers.*;

import tryy.transports.*;


public class Main {
    public static void main(String[] args) {


//        for (int i = 1; i <= 4; i++) {
//            DriverB driverB = new DriverB("Name B " + i, true, 1 + i);
//            Car car = new Car("Бренд авто " + i, "Модель авто " + i, 1.5, driverB);
//
//            DriverD driverD = new DriverD("Name D " + i, true, 4 + i);
//            Bus bus = new Bus("Бренд автобуса " + i, "Модель автобуса " + i, 3.0, driverD);
//
//            DriverC driverC = new DriverC("Name C " + i, true, 8 + i);
//            Truck truck = new Truck("Бренд грузовика " + i, "Модель грузовика " + i, 4.5, driverC);
//
//
//            printInfo(car);
//            printInfo(truck);
//            printInfo(bus);


        DriverB driverB= new DriverB("Vagov Vag Vagovich",true,1);
        Car car1 = new Car("bmw","z8",3.2,driverB, Car.BodyType.HATCHBACK);

        DriverD driverD= new DriverD("name",true,1);
        Bus bus1 = new Bus("brand","model",3.1, driverD, Bus.Capacity.EXTRA_SMALL);

        DriverC driverC= new DriverC("name",true,1);
        Truck truck = new Truck("Truck","model Truck",4.1, driverC,Truck.CarryingCapacity.N1);

        Bus bus2 = new Bus("asd","das",1.2,driverD,Bus.Capacity.SMALL);

     //   driverB.setLicense(false);

        truck.passDiagnostics();

        car1.passDiagnostics();

    }



}

//    private static void printInfo(Transport<?> transport) {
//        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
//    }
//}