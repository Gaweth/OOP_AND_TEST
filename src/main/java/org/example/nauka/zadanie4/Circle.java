package org.example.nauka.zadanie4;

public class Circle extends Shape {
    float radius;

    public Circle(String color, boolean filled, float radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle() {
        this.color = "uknown";
        this.isFilled = false;
        this.radius = 1;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI*radius*radius);
    }

    @Override
    public float getPerimeter(){
        return (float) (2*Math.PI*radius);
    }

    @Override
    public String toString() {
        return "Circle with radius= " + radius + " wchis is subclass off y " + super.toString();
    }
}

