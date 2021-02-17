package org.example.nauka.zadanie4;

public class Zadanie3Main {
    public static void main(String[] args) {
            Shape[] shapes = {
                    new Circle("blue", true, 20),
                    new Rectangle("yellow", true, 20, 30),
                    new Square("green", false, 40)
            };

            for (Shape shape : shapes) {
                System.out.println(shape);
                System.out.println(shape.getArea());
                System.out.println(shape.getPerimeter());
            }
        }
    }