package org.example.OOP_basic.java8.functionalInterfaces.function;

import org.example.OOP_basic.java8.functionalInterfaces.Car;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Car familyCar = new Car("ford Smax", "1.6");
        Car sportCar = new Car("ford mustang", "5.3");
        Car volvaCar = new Car("volvo V50", "1.7");

        Function<Car, String> getEngine = (x) -> x.getEngine();
        Function<Car, String> nameUpperCase = x->x.getName().toUpperCase();

        System.out.println("============================");
        System.out.println(getEngine.apply(familyCar));

        System.out.println("============================");
        System.out.println(nameUpperCase.apply(familyCar));

        Function<Car, Car> upgradeCar = car -> {
            return new Car(car.getName() + " upgraeded"
                    , car.getEngine() + " TURBO");
        };

        Car newCar = upgradeCar.apply(volvaCar);
        System.out.println("===========");
        System.out.println(newCar);
    }
}
