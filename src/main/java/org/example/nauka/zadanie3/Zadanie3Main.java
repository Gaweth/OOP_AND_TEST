package org.example.nauka.zadanie3;

public class Zadanie3Main {
    public static void main(String[] args) {

        Shape shape = new Shape("red", true);
        System.out.println(shape);

        System.out.println("\n");

        Shape circle = new Circle("blue", true, 20);
        Circle circle1 = new Circle("20", true,20 );

        System.out.println(circle1);

    }
}
