package Enumless.transports;

import oop.drivers.Driver;


public abstract class Transport<T extends Driver> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;



    public Transport(String brand, String model, double engineVolume, T driver) {

        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public abstract void startMoving();
    public abstract void printType();
    public abstract void stopMoving();


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
}


