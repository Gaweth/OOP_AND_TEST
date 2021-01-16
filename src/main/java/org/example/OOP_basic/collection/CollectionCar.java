package org.example.OOP_basic.collection;

import java.util.Objects;

public class CollectionCar implements Comparable<CollectionCar> {
    private String name;
    private String engine;
    private Integer maxSpeed;
    private String color;


    public CollectionCar(String name, String engine, int maxSpeed) {
        this.name = name;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color != null //jesli kolor jest nulem
                ? getColorAsExist() // to go zwroc
                : "";// a jak nie to cos innego
    }

    private String getColorAsExist() {
        System.out.println("kolor istnnieje");
        return color;
    }

    private String getColorNotExist() {
        return "no spec color";
    }

    @Override
    public String toString() {
        return "CollectionCar{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                (color != null ? ", color='" + color + '\'' : getColorNotExist()) +
                '}';
    }

    //zwaraca numer identyfikujacy nasz obiekt
    // moze byc unikalny ale nie koniecznie
    //powinien pozwalac na podziel obiektyow tej samej klasy
    //na mniejszy podzbiory
    @Override
    public int hashCode() {
        // wyliczamy na podstawie pol
        //o ktorych wiemy ze bda niepusta
        //i decuduja o niepowtarzalnosci obiektu
        // w ramach naszych kryteriow
        return Objects.hash(name, engine, maxSpeed);
    }

    @Override
    public boolean equals(Object obj) {


        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        CollectionCar car = (CollectionCar) obj;

        return maxSpeed == car.maxSpeed &&
                name.equals(car.name) && engine.equalsIgnoreCase(car.engine);

    }

    @Override
    public int compareTo(CollectionCar anotherCar) {

        return engine.compareTo(anotherCar.engine);
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }
}
