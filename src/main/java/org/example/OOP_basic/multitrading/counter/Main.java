package org.example.OOP_basic.multitrading.counter;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Counter counter2 = new Counter();

        ThreadCounter threadCounter1 = new ThreadCounter(counter);
        ThreadCounter threadCounter2 = new ThreadCounter(counter2);
        threadCounter1.setName("Thread1");
        threadCounter2.setName("Thread2");

        threadCounter1.start();
        threadCounter2.start();

    }
}
