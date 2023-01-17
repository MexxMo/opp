package Enumless.transports;

import oop.drivers.DriverB;

public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType ) {
        super(brand, model, engineVolume, driver);
        this.bodyType=bodyType;
    }

    public enum BodyType {
        SEDAN("Седан"),
       HATCHBACK("Хетчбэк"),
       COUPE("Купе"),
       CUV("Универсал"),
       SUV("Внедорожник"),
       CROSSOVER("Кроссовер"),
       PICKUP("Пикап"),
       VAN("Фургон"),
       MINIVAN("Минивэн");
       private final String translate;

       BodyType(String translate) {
           this.translate = translate;
       }

        @Override
        public String toString() {
            return translate;
        }
    }
    private BodyType bodyType;

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " остановился");
    }

    @Override
    public void printType() {
        if (bodyType==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {System.out.println("Кузов: " + bodyType);}

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп авто" + getBrand());

    }

    @Override
    public void bestTime() {
        int minBound = 200;
        int maxBound = 250;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга авто " + bestTime);
    }


    @Override
    public void maxSpeed() {
        int minBound = 200;
        int maxBound = 250;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость авто " + maxSpeed);

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
