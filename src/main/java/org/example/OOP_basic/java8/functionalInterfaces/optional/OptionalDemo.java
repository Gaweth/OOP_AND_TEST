package org.example.OOP_basic.java8.functionalInterfaces.optional;

import org.example.OOP_basic.java8.functionalInterfaces.Car;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Car familyCar = new Car("ford Smax", "1.6");
        Car sportCar = new Car("ford mustang", "5.3");
        Car volvaCar = new Car("volvo V50", "1.7");
        Car unknowCar = null;

        //pusty kontenet na obiekt
        Optional<Car> carOptional = Optional.empty();

        //kontener z zawartoscia
        //metoda of tworzy Optionala i wy,aga aby zawartosc byla
        Optional<Car> carOptionalFilled = Optional.of(familyCar);

        //metoda .ofNullable tworzy Optionala i dopuszcza pusta zawartosc
        Optional<Car> optionalCarNullable = Optional.ofNullable(sportCar);

        Optional<Car> optionalOnUknown = Optional.ofNullable(unknowCar);


        //pre optional
        if (volvaCar==null) {
            // do sth
        }


        //z optionalem
        //isPresent testuje czy w optionalu jest obiekt
        if(carOptionalFilled.isPresent())
        {
            // metoda get() wyciaga wlasciwy obiekt z Optonala
            Car weKnowYouAreThere = carOptionalFilled.get();
            System.out.println(carOptionalFilled.get());
        }

        if(optionalOnUknown.isEmpty())
        {
            System.out.println("tu nic nie ma w tym pudelku");
        }


    }
}
