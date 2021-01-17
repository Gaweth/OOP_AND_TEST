package org.example.OOP_basic.java8.lambdas;



@FunctionalInterface
public interface StringAdding {
    //jedyna akbstrakcyjna metoda w interfejsie funkcyjnym
    String add(String arg1, String arg2);

    //jesli dozolmy koljne metode abstrakcyjna to
    //IDE podswietli anotajce
    //void testAnotherMethod();

    default void someOfTheMethodWithBody() {
        System.out.println("this is default method body from interface");

    }
}
