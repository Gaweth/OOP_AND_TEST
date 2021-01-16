package org.example.OOP_basic.comparing;

import org.example.OOP_basic.collection.CollectionCar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingDemo {
    public static void main(String[] args) {
        CollectionCar car1 = new CollectionCar("bmw", "diesel 1.3", 220);
        CollectionCar car2 = new CollectionCar("ford", "beznzyna 1.1", 190);
        CollectionCar car3 = new CollectionCar("volvo", "diesel 1.2", 150);
        CollectionCar car4 = new CollectionCar("fiat", "gas 1.0", 180);

        car1.setColor("blue");
        car2.setColor("black");
        car3.setColor("red");
        car4.setColor("green");

        List<CollectionCar> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        System.out.println();
        System.out.println("drukujemt elementy listy jak przyszly");
        for (CollectionCar car : carList) {
            System.out.println(car);

        }

        System.out.println("\n=========\ndrukujemt elementy listy posortowane przy pomocy domyslnego komperatora");
        Collections.sort(carList);
        for (CollectionCar car : carList) {
            System.out.println(car);
        }

        System.out.println("\n=========\ndrukujemt elementy listy posortowane przy pomocy domyslnego komperatora");
        System.out.println("ALE OD KONCA");
        Collections.sort(carList, Collections.reverseOrder());
        for (CollectionCar car : carList) {
            System.out.println(car);
        }


        System.out.println("\n=============\ndruujemy elementy po max predkosci");

        Collections.sort(carList, new CollectionsCarComparedBySpeed());
        for (CollectionCar car : carList) {
            System.out.println(car);
        }

        System.out.println("\n=============\ndruujemy elementy po max predkosci");
        System.out.println("ale od konca");
        Collections.sort(carList, new CollectionsCarComparedBySpeed().reversed());
        for (CollectionCar car : carList) {
            System.out.println(car);
        }

        System.out.println("\n========\nDrulujemy elementy posortowane po kolorze i predkosci");
        Collections.sort(carList, new CollectionsCarComparaedByColorAndSpeed());
        for ( CollectionCar car : carList){
            System.out.println(car);

        }

        car3.setColor("black");

        System.out.println("\n========\nDrulujemy elementy posortowane po kolorze i predkosci");
        System.out.println("takie same kolory: black");
        Collections.sort(carList, new CollectionsCarComparaedByColorAndSpeed());
        for ( CollectionCar car : carList){
            System.out.println(car);

        }

    }
}
