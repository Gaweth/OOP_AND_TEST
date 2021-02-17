package org.example.nauka.zadanie3;

public  class Shape {
    String color;
    boolean isFilled;

    public Shape() {
        this.color = "uknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }

}
