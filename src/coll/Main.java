package coll;

import coll.drivers.*;
import coll.transports.*;

import java.util.*;


public class Main {

    public static Set<Driver<?>> drivers = new HashSet<>();
    public static List<Transport<?>> transports = new ArrayList<>();
    public static Map<Transport<?>, Set<Mechanic<?>>> mechanics = new HashMap<>();

    public static void addMechanics(Transport<?> transport, Mechanic<?>... mechanics){
        Set<Mechanic<?>> mechanic = new HashSet<>(List.of(mechanics));
        Main.mechanics.put(transport, mechanic);
    }

    public static void main(String[] args) {


        DriverB serega = new DriverB("Serega", true, 10);
        DriverC otec = new DriverC("Otec", true, 25);


        drivers.add(serega);
        drivers.add(otec);

        Car car1 = new Car("Brand car", "model car", 1.5, serega, Car.BodyType.COUPE);
        Truck truck1 = new Truck("brend truck", "model truck", 2.4, otec, Truck.CarryingCapacity.N3);

        Mechanic<Car> oleg = new Mechanic<>("Oleg", "Oleg Int.");
        Mechanic<Car> ultraMeh = new Mechanic<>("Boss Mex", "Oleg Int.");

        transports.add(car1);
        transports.add(truck1);


        addMechanics(car1,oleg,oleg,ultraMeh);

        System.out.println(mechanics.get(car1));


    }

}
