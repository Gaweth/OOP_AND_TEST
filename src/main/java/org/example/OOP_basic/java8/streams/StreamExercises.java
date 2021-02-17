package org.example.OOP_basic.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises {
    public static void main(String[] args) {

        class  HumanDTO {
            String name;
            String surname;

            public HumanDTO(String name, String surname) {
                this.name = name;
                this.surname = surname;
            }

            public String getHumanDTO(){
                return surname + " " + name;
            }
        }

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
                .filter(x -> x.isOver20AndGenderMan())
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

        System.out.println("========= 2ludzi ponizej 30 lat  =========");
    people.stream()
            .filter(x -> x.getAge() <30)
            .limit(2)
            .forEach(System.out::println);

        System.out.println("===========");
        System.out.println("ludzie posortowani po nazwisku");

        System.out.println("+++klasycznie+++");
        Collections.sort(people);
        people.forEach(System.out::println);
        System.out.println("po nowemu");
        people.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("===========");
        System.out.println("ludzie posortowani po imieniu");
        System.out.println("+++klasycznie+++");
        Collections.sort(people, new HumanComparedByName());
        people.forEach(System.out::println);
        System.out.println("+++++jako stream++opcja 1++");
        people.stream()
                .sorted(new HumanComparedByName())
                .forEach(System.out::println);
        System.out.println("=======");
        System.out.println("opcaj 2");
        people.stream()
                .sorted(Comparator.comparing(Human::getAge))
                .forEach(System.out::println);

        System.out.println("==============");
        System.out.println("nowa kolekcja gdzie beda tylko mezczyzni");
        List<Human> menOnly=new ArrayList<>();
        for (Human person : people) {
            if (Gender.MAN==person.getGender())
            {
                menOnly.add(person);
            }
            menOnly.forEach(System.out::println);
        }
        System.out.println("zapis tylko kobiet po straemie");
       List<Human> womanOnly = new ArrayList<>();

        womanOnly = people.stream()
                .filter(x -> Gender.WOMAN == x.getGender() )
                .sorted(Comparator.comparing(Human::getAge))
                .collect(Collectors.toList());
        womanOnly.forEach(System.out::println);

        System.out.println("==============");
        System.out.println("wypisac tylko nazwisko i imie");
        List<Human> subname=new ArrayList<>();
        for (Human human : people) {
            System.out.println(human.getSurname() + " " + human.getName());
            System.out.println("==============");
            System.out.println("po ForEache");

                   people.forEach(x -> System.out.println(x.getSurname()+" "+x.getName()));
            System.out.println("po Stream");
            people.stream()
                    .forEach(x -> System.out.println(x.getSurname()+" "+x.getName()));

            System.out.println("=======Stream=======");
            System.out.println("z przeklatceniem obiektu");
            people.stream()
                    .map(( x -> x.getSurname() + " " + x.getName()))
                    .forEach(System.out::println);

            System.out.println("==============");
            System.out.println(" przepisujemy wszystkich ludzi do HumanDTO");
            List<HumanDTO> humanDTOS = new ArrayList<>();
            for (Human person : people) {
                humanDTOS.add(new HumanDTO(human.getName(), human.getSurname()));
            }
            System.out.println("print z DTOS");
            humanDTOS.forEach(x -> System.out.println(x.getHumanDTO()));
            System.out.println(" a teraz ze streamem");
            List<HumanDTO> humanDTOSfromStream = new ArrayList<>();
            humanDTOSfromStream = people.stream()
                    .map(x-> new HumanDTO(x.getName(), x.getSurname()))
                    .collect(Collectors.toList());
            System.out.println("print DTOS ze streama");
            humanDTOSfromStream.forEach(x -> System.out.println(x.getHumanDTO()));

            System.out.println("==============");
            System.out.println("wlaczyc 2 kolekce menOnly i womenOnly w nowa i wypisac zawartosc ");
            List<Human> newCommonHuman = new ArrayList<>();
            newCommonHuman.addAll(womanOnly);
            newCommonHuman.addAll(menOnly);
            newCommonHuman.forEach(System.out::println);
            System.out.println("==============");
            System.out.println(" uzycie streamu");
            List<Human> newFromStreamHumanKind = new ArrayList<>();
            newFromStreamHumanKind = Stream.of(menOnly, womanOnly)
                    .flatMap(a -> a.stream())
                    .collect(Collectors.toList());

            newFromStreamHumanKind.forEach(System.out::println);


            System.out.println("==============");
            System.out.println("+++++++Reduce - sama lat wszystkich ludzi++++++");
            int sumOfAge = people.stream()
                    .map(Human::getAge)
                    .reduce(0,(suma, nowy) -> suma + nowy);
            System.out.println("suma lat "+sumOfAge);

            System.out.println("==============");
            System.out.println("++++ Reduce - zwracamy 1 String laczacy wszystkie imiona +++++");
            String namesJoined=people.stream()
                    .map(Human::getName)
                    .collect(Collectors.joining());
            System.out.println("names Joinder: " + namesJoined);

            String surnamesJoinedWithCommas= people.stream()
                    .map(Human::getSurname)
                    .collect(Collectors.joining(", "));
            System.out.println("suranmes joined with comas "+surnamesJoinedWithCommas);


            System.out.println("==============");
            System.out.println("zwracamy jeden string laczany wszystkie nazwiksa");
            System.out.println("+++++ i nawiasami przed i po ++++++");
            String jSonStyleSurnames = people.stream()
                    .map(Human::getSurname)
                    .collect(Collectors.joining(" ", "{","}"));
            System.out.println("surnames with comas ands brackets "+ jSonStyleSurnames);


            System.out.println("==============");
            System.out.println("z listy zrobimy mape gdzie kliczem bedzie imie oa wartoscia obiekt");
            Map<String, Human> mapPeopleBynam = people.stream()
                    .collect(Collectors.toMap(Human::getName, x -> x));
            mapPeopleBynam.keySet().forEach(System.out::println);
            System.out.println("obiekt mapy");
            mapPeopleBynam.values().forEach(System.out::println);
            System.out.println("klucz i pod spodem obiekt");
            mapPeopleBynam.keySet().stream()
                    .map(x-> x +"\n"+mapPeopleBynam.get(x))
                    .forEach(System.out::println);

            Map<String, List<Human>> peopleGroupBySurnames = new HashMap<>();
            peopleGroupBySurnames = people.stream()
                    .collect(Collectors.groupingBy(Human::getSurname, Collectors.toList()));
            System.out.println("+++++++");


            }
        }
    }


