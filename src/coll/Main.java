package coll;

import coll.drivers.*;
import coll.transports.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static List<Driver<?>> drivers = new ArrayList<>();
    public static List<Transport<?>> transports = new ArrayList<>();
    public static List<Mechanic<?>> mechanics = new ArrayList<>();


    public static void main(String[] args) {


        DriverB serega = new DriverB("Serega", true, 10);
        DriverC otec = new DriverC("Otec", true, 25);


        drivers.add(serega);
        drivers.add(otec);

        Car car1 = new Car("Brand car","model car",1.5,serega, Car.BodyType.COUPE);
        Truck truck1= new Truck("brend truck","model truck",2.4,otec, Truck.CarryingCapacity.N3);

        Mechanic<Car> oleg = new Mechanic<>("Oleg","Oleg Int.");
        Mechanic<?> ultraMeh = new Mechanic<>("Boss Mex","Oleg Int.");

        car1.addMechanic(oleg);
        car1.addMechanic(ultraMeh);

        truck1.addMechanic(ultraMeh);

        car1.showInfo();
        System.out.println();
        truck1.showInfo();

    }


}
