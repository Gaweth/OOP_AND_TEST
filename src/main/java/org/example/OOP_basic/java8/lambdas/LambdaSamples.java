package org.example.OOP_basic.java8.lambdas;

import org.example.OOP_basic.multitrading.basic.RunableSample;

public class LambdaSamples {
    public static void main(String[] args) {

        String first = "aaa";
        String second = "bbb";



        StringAdding adding = (a, b)->{return a + b;};

        StringAdding addingOneSign = (String a, String b)->{return a.substring(0,1) + " " + b.substring(0,1);};

        StringAdding addingOneSignNoReturn = (String a, String b)-> a.substring(0,1) + " " + b.substring(0,1);

        System.out.println("=======");
        System.out.println(adding.add(first, second));
        System.out.println("=======");

        StringAdding anotherAdding = new StringAdding() {
            @Override
            public String add(String arg1, String arg2) {
                return arg1 + arg2;
            }
        };
        //Thread PRE Java 8
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("doing some multithreading stuff");
            }
        });
        thread.start();

        //Thread since Java 8
        Thread lambdaThread = new Thread(() -> {
            System.out.println("Lambda style generated thread");
        });
    lambdaThread.start();

    IntMultiplication multiplication = (x,y) ->x*y;
        System.out.println("==============");
        System.out.println(multiplication.multiply(3, 5));
    }
    }
