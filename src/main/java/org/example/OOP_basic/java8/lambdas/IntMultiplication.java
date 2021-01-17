package org.example.OOP_basic.java8.lambdas;

@FunctionalInterface
public interface IntMultiplication {
    //dodac metode ktora pomnozy dwie przekazane liczby
    //wywolac ja jako lambde

    int multiply(int a, int b);

    default void someMethodForInt() {
        System.out.println("this is default method body from interface");
    }
}