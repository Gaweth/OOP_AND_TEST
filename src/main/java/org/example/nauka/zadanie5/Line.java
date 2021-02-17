package org.example.nauka.zadanie5;

import org.example.nauka.zadanie1.Punkt2D;

import java.awt.geom.Point2D;

public class Line {
    private Punkt2D p1, p2;

    public Line(Punkt2D p1, Punkt2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(float p1Start, float p1End, float p2Start, float p2End) {
        this.p1 = new Punkt2D(p1Start,p1End);
        this.p2 = new Punkt2D(p2Start,p2End);
    }

    public Punkt2D getP1() {
        return p1;
    }
    public Punkt2D getP1(Punkt2D p1) {
        return p1;
    }

    public Punkt2D getP2() {
        return p2;
    }

    public Punkt2D getP2(Punkt2D p2) {
        return p2;
    }

    public float getLength(){
        return (float) Math.sqrt((Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2)));
    }

    public Punkt2D getMiddle(){
        float xMiddle = (p1.x + p2.x) / 2;
        float yMiddle = (p1.y + p2.y) / 2;
        return new Punkt2D(xMiddle, yMiddle);
    }


}


