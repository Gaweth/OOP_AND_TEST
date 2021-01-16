package org.example.OOP_basic.abstractionAndPoli;

public class Polymorph {
    public static void main(String[] args) {
        //klasyka polimorfizmu
        Bee bee = new Bee();
        bee.move();
        bee.hibernate();

        Pinguin pinguin = new Pinguin();
        pinguin.move();

        //wywolanie z polimorfizmem
        Animals polyBee = new Bee();
        polyBee.move();

        //rzutowanie do bee zeby wywolac hibernacje
        ((Bee) polyBee).hibernate();

        //konczy sie bledem bo pingwin nie moze byc pszczola
        Animals polyPinguin = new Pinguin();
        polyPinguin.move();
        ((Bee) polyPinguin).hibernate();

      //  Bee anotherBee = new Animals();



    }
}
