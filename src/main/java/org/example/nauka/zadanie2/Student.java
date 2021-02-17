package org.example.nauka.zadanie2;

public class Student extends Person {
    String typeOf;
    int yearOf;
    float priceOf;

    public Student(String name, String adress, String typeOf, int yearOf, float priceOf) {
        this.name = name;
        this.adress = adress;
        this.typeOf = typeOf;
        this.yearOf = yearOf;
        this.priceOf = priceOf;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public int getYearOf() {
        return yearOf;
    }

    public float getPriceOf() {
        return priceOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }

    public void setYearOf(int yearOf) {
        this.yearOf = yearOf;
    }

    public void setPriceOf(float priceOf) {
        this.priceOf = priceOf;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + name +  "\n"  +
                "adress= " + adress + "\n" +
                "typeOf='" + typeOf + "\n" +
                ", yearOf=" + yearOf + "\n" +
                ", priceOf=" + priceOf +
                '}';
    }
}

