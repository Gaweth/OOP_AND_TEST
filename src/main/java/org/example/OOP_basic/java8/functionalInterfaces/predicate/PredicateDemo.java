package org.example.OOP_basic.java8.functionalInterfaces.predicate;

import org.example.OOP_basic.java8.functionalInterfaces.Car;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Car familyCar = new Car("ford Smax", "1.6");
        Car sportCar = new Car("ford mustang", "5.3");
        Car volvaCar = new Car("volvo V50", "1.7");

        Predicate<Car> isSmallEngine= x -> x.getEngine().compareTo("2.0") < 0;
        Predicate<Car> isFord = a -> a.getName().startsWith("ford");

        if(isFord.test(familyCar))
        {
            System.out.println(familyCar);
        } else {
            System.out.println("sprawdzonyuy samochodz nie jest forde");
        }
        printCar(familyCar, isSmallEngine);
        printCar(sportCar, isSmallEngine);
        printCar(familyCar, isFord);
        printCar(volvaCar, isFord);
    }

    private static void  printCar(Car car, Predicate<Car> condtition)
    {
        if(condtition.test(car))
        {
            System.out.println("passed: " + car.getName() +" " + car.getEngine());
        } else System.out.println("failed: "+ car.getName());
    }
}
