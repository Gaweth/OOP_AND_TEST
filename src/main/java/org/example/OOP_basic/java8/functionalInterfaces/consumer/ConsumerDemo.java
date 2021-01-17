package org.example.OOP_basic.java8.functionalInterfaces.consumer;

import org.example.OOP_basic.java8.functionalInterfaces.Car;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Car sportCar = new Car("porshe 911", "4,5");
        Car familyCar = new Car("volvo V50", "2.0");

        Consumer<Car> printCarMark = (car) -> {
            System.out.println("printing cars mak for " + car.getName());
            System.out.println(car.getName().substring(0, car.getName().indexOf(" ")));
        };

        Consumer<Car> printCarInfoWithNoSpaces = car -> {
            System.out.println(car.getName().replaceAll(" ", "") +
                    car.getEngine().replaceAll(" ", ""));
        };

        printCarMark.accept(sportCar);
        printCarMark.accept(familyCar);
        printCarInfoWithNoSpaces.accept(sportCar);

        System.out.println("sout jest cosumerem, nie wprost ale z uwagi na sposob dzialania na pewno");

    }
}
