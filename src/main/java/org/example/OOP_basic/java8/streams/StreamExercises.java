package org.example.OOP_basic.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExercises {
    public static void main(String[] args) {


        List<Human> people = new ArrayList<>();
        people.add(new Human("jan", " Kowalski" , 33, Gender.MAN));
        people.add(new Human("Monika", " Nowak" , 33, Gender.WOMAN));
        people.add(new Human("Ewa", " baniak" , 33, Gender.WOMAN));

        people.add(new Human("Roman", " Zajac" , 25, "M"));
        people.add(new Human("Alicja", " krolik" , 25, "W"));
        people.add(new Human("Krzystaf", " menda" , 25, "M"));

        System.out.println("========ForEach po ludziach, jeszcze z wywolaniem przez refenecje===========");
        people.forEach(System.out::println);
        System.out.println("==ForEach po ludziach przy uzyciu lambdy=================");
        people.forEach(x -> System.out.println(x));
        System.out.println("===================");

        System.out.println("ludzie ktorzy maja powyzej 20 lat");
        for (Human person : people)
        {
            if (person.getAge() > 20)
            {
                System.out.println(person);
            }
        }

        System.out.println("!!!!!====Stream JAVA 8=====!!!!!!");
        people.stream()
                .filter(x -> x.getAge() >20)
                .forEach(System.out::println);
        System.out.println("================");
        System.out.println("Mezczyzni powyzej 20 lat");
        System.out.println(" 2 filtry");
        people.stream()
                .filter(x -> x.getAge() > 20)
                .filter(x -> Gender.MAN == x.getGender())
                .forEach(System.out::println);
        System.out.println("==================");
        people.stream()
                .filter(x -> x.getAge() > 20 && "M".equals(x.getGender().getShortcutPl()))
                .forEach(System.out::println);
        System.out.println("=================");
        System.out.println(" 20 lat mezczyzni wywolany z metody");
        people.stream()
                .filter(x -> x.isOVer20AndMan())
                .forEach(System.out::println);
        System.out.println("=================");
        System.out.println("ze strumienia / kolekcji wypisac tylko 2 obiekty");
        int counter = 0;
        for (Human person : people)
        {
            System.out.println(person);
            counter++;
            if (counter >=2)
            {
                break;
            }
        }
        System.out.println(" a teraz stream");
        people.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("=========  =========");


    }
}