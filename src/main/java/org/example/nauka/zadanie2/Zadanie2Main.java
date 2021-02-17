package org.example.nauka.zadanie2;

public class Zadanie2Main {
    public static void main(String[] args) {
        Person student = new Student("Jakub Magdon", "Kilinskiego 5", "zaocznie", 5, 100000);
        System.out.println(student);

        Person lecture = new Lecture("bral", 10000, "bonzo zombo");
        System.out.println(lecture);
    }
}
