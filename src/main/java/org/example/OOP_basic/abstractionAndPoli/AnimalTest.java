package org.example.OOP_basic.abstractionAndPoli;

import org.example.OOP_basic.encaoulation.person.People;

public class AnimalTest {
    public static void main(String[] args) {

        Animals animals;

        Bird bird = new Bird();
        bird.move();

        Fish fish = new Fish();
        fish.move();

        Pinguin pinguin = new Pinguin();
        pinguin.move();

        Bee bee = new Bee();
        bee.move();
    }
}
