package org.example.nauka.zadanie1;

public class Punkt2D {

    public float x;
    public float y;

    public Punkt2D() {
        this.x = x;
        this.y = y;
    }

    public Punkt2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x= " + x +
                "y= " + y;
    }
}
