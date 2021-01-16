package org.example.OOP_basic.comparing;

import org.example.OOP_basic.collection.CollectionCar;

import java.util.Comparator;

public class CollectionsCarComparaedByColorAndSpeed implements Comparator<CollectionCar> {

   @Override
    public int compare(CollectionCar car1, CollectionCar car2) {
        if(car1.getColor().compareTo(car2.getColor()) != 0)
       {
           return car1.getColor().compareTo(car2.getColor());
       }

        if (car1.getMaxSpeed().compareTo(car2.getMaxSpeed()) != 0)
       {
           return car1.getMaxSpeed().compareTo(car2.getMaxSpeed());

       }
        return 0;
    }
}
