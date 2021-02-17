package org.example.nauka.zadanie2;

public class Lecture extends Person {
    String specialization;
    float payment;

    public Lecture(String specialization, float payment, String name) {
        this.name = name;
        this.specialization = specialization;
        this.payment = payment;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Lecture{" + "name " + name +
                "specialization='" + specialization + '\'' +
                ", payment=" + payment +
                '}';
    }
}
