package org.example.OOP_basic.java8.functionalInterfaces.suppiler;

import org.example.OOP_basic.java8.functionalInterfaces.Car;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Car familyCar = new Car("ford SMax", "3.0");
        Supplier<Car>sportCar = () ->{return new Car("Ford Mustang GT", "5,4");};

        Supplier<Car> vanCar = () -> new Car("VW Transporter", "2.5");

        System.out.println(sportCar.get());

        System.out.println("info o samochodzie sportowym");
        System.out.println(carInfo(sportCar));
        System.out.println("info o samochodze dostawczym");
        System.out.println(carInfo(vanCar));

    }

    public static String carInfo(Supplier<Car> carToCheck)
    {
        Car passedCar = carToCheck.get();
        return new StringBuilder(passedCar.getName()).
                append(" ").
                append(passedCar.getEngine())
                .toString();
    }


}
