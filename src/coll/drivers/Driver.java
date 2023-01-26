package coll.drivers;

import coll.transports.Transport;

import java.util.Objects;

public abstract class Driver<T extends Transport<?>>  {

    private String name;
    private boolean license;
    private int driverExperience;

    private T trasport;


    public Driver(String name, boolean license, int driverExperience) {
        this.name = name;
        this.license = license;
        this.driverExperience = driverExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return license == driver.license && driverExperience == driver.driverExperience && Objects.equals(name, driver.name) && Objects.equals(trasport, driver.trasport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, license, driverExperience, trasport);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", license=" + license +
                ", driverExperience=" + driverExperience +
                '}';
    }
}

