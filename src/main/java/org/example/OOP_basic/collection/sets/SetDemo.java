package org.example.OOP_basic.collection.sets;

import org.example.OOP_basic.collection.CollectionCar;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {



    CollectionCar car1 = new CollectionCar("bmw", "diesel 1.3", 220);
    CollectionCar car2 = new CollectionCar("ford", "beznzyna", 190);
    CollectionCar car3 = new CollectionCar("volvo", "diesel 1.2", 150);
    CollectionCar car4 = new CollectionCar("fiat", "gas", 180);
        System.out.println();
    Set<CollectionCar> setOfCars = new HashSet<>();

    setOfCars.add(car1);
    setOfCars.add(car2);
    setOfCars.add(car3);
    setOfCars.add(car4);

        System.out.println("set niepowtarzalnych elementow z niedefikowana kolekcja");
        for (CollectionCar car: setOfCars) {
            System.out.println(car);
        }

        Set<CollectionCar> linkedSet = new LinkedHashSet<>();
        linkedSet.add(car1);
        linkedSet.add(car2);
        linkedSet.add(car3);
        linkedSet.add(car4);

        System.out.println();
        System.out.println("LinkedHash set przechpwuje elementy w kolejknosci wprowadzania");

        for (CollectionCar car : linkedSet)
        {
            System.out.println(car);
        }

        Set<CollectionCar> sortedSet = new TreeSet<>();
        sortedSet.addAll(linkedSet);
        System.out.println("\nSet posortowant alfabetycznie po silniku");
        for (CollectionCar car : sortedSet)
        {
            System.out.println(car);
        }
    }
}
