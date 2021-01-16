package org.example.OOP_basic.abstractionAndPoli;

public class Bee extends Worm {
    @Override
    public void move() {
        System.out.println("bee is flying");
    }

    @Override
    public void hibernate() {
        System.out.println("winter is coming, lets sleep");
    }
}
