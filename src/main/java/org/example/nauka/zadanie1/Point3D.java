package org.example.nauka.zadanie1;

public class Point3D extends Punkt2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public float[] getXYZ (float x, float y, float z){
        return new float[] {x,y,z};
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ (float x , float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x= " + x +
                ", y= " + y +
                ", z= " + z +
                '}';
    }
}
