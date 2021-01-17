package org.example.OOP_basic.interfaces.multiExtending;

public class Human implements Student, Performer {
    @Override
    public void perform() {
        System.out.println("perform method implementation");
    }

    @Override
    public void study() {
        System.out.println("Study method implementation");
    }

    @Override
    public void work() {
        System.out.println("Work method implementation");
    }

    @Override
    public void obtainPlan() {
        System.out.println("Obtain plan methos implementation");
    }
}
