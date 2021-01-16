package org.example.OOP_basic.collection.maps;

import org.example.OOP_basic.collection.CollectionCar;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        CollectionCar car1 = new CollectionCar("bmw", "diesel 1.3", 220);
        CollectionCar car2 = new CollectionCar("ford", "beznzyna", 190);
        CollectionCar car3 = new CollectionCar("volvo", "diesel 1.2", 150);
        CollectionCar car4 = new CollectionCar("fiat", "gas", 180);

        Map<String, CollectionCar> mapSortByName = new HashMap<>(); {
            mapSortByName.put(car1.getName(), car1);
            mapSortByName.put(car1.getName(), car1);
            mapSortByName.put(car1.getName(), car1);
            mapSortByName.put(car1.getName(), car2);
            mapSortByName.put(car1.getName(), car3);
            mapSortByName.put(car1.getName(), car4);
            mapSortByName.put(car1.getName(), car4);

            System.out.println("zestaw klucz");
            for (String key : mapSortByName.keySet())
            {
                System.out.println(key);
            }

            System.out.println("drukujemy zawartosc mapy");
            for (CollectionCar car : mapSortByName.values())
            {
                System.out.println(car);
            }

            System.out.println("\n drukuj zestaw wartosci pobierajac je kluczami");
            for (String key: mapSortByName.keySet())
            {
                //pobierz wartosc z mapy dla ktorej klucz jest...
                System.out.println(mapSortByName.get(key));
            }

            System.out.println("\n=====\nDrukowanie po zestawie kluczy + wartosc");
            for (Map.Entry<String, CollectionCar> carEntry: mapSortByName.entrySet()){
                System.out.println("klucz: "+ carEntry.getKey());
                System.out.println("wartosc: \n"+ carEntry.getValue() + "\n");
            }
        }
    }
}
