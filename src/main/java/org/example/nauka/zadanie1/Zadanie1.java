package org.example.nauka.zadanie1;

public class Zadanie1 {
    public static void main(String[] args) {
        Punkt2D punkt2D = new Punkt2D(5,10);
        punkt2D.setXY(22,33);
        punkt2D.getXY();
        System.out.println(punkt2D);
        Point3D point3D = new Point3D(11,44,55);
        point3D.setXYZ(77,89,65);
        System.out.println(point3D);


    }
}
