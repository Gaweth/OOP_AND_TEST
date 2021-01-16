package org.example.OOP_basic.collection.lista;

import org.example.OOP_basic.collection.CollectionCar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        CollectionCar car1 = new CollectionCar("bmw", "diesel", 220);
        CollectionCar car2 = new CollectionCar("ford", "beznzyna", 190);
        CollectionCar car3 = new CollectionCar("volvo", "diesel", 150);
        CollectionCar car4 = new CollectionCar("fiat", "gas", 180);

        List<CollectionCar> oldStyleList = new ArrayList<CollectionCar>();

        List<CollectionCar> carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        System.out.println();
        for (int i = 0; i < carArrayList.size(); i++) {
            System.out.println(carArrayList.get(i));

        }
        System.out.println();

        List<CollectionCar> linkedListCars = new LinkedList<>();
        linkedListCars.add(car1);
        linkedListCars.add(car2);
        linkedListCars.add(car3);
        linkedListCars.add(car4);

        for (CollectionCar linkedListCar: linkedListCars) {
            System.out.println(linkedListCar);
        }
    }
}
