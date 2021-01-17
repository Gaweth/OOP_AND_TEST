package org.example.OOP_basic.java8.functionalInterfaces;

public class Car {
    private String name;
    private String engine;

    public Car(String name, String engine) {
        System.out.println("creating new car " + name);
        this.name = name;
        this.engine = engine;

    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return name + " " + engine;
    }
}
