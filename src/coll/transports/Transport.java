package coll.transports;

import coll.CantLicenseException;
import coll.drivers.Driver;
import coll.Mechanic;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public abstract class Transport<T extends Driver<?>> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;
    private final Set<Mechanic<?>> mechanics = new HashSet<>();

    public void addMechanic(Mechanic<?> mechanic) {

        mechanics.add(mechanic);
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void showInfo() {
        System.out.printf("Водитель: %s\nМеханики: %s\n", driver, getMechanics());
    }


    public Transport(String brand, String model, double engineVolume, T driver) {

        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public abstract void startMoving();

    public abstract void printType();

    public abstract void stopMoving();

    public abstract void passDiagnostics() throws CantLicenseException;


    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.2;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return brand + " " +
                model + " Объем двигателя " +
                engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanics);
    }
}


