package org.example.OOP_basic.encaoulation.person;

public class People {
    public static void main(String[] args) {

        Person person = new Person();

        person.age = 20;
        System.out.println(person.age);

        person.lastName = "kowalski";
        System.out.println(person.lastName);

        person.noOfChildren = 3;
        System.out.println(person.noOfChildren);


    }
}
