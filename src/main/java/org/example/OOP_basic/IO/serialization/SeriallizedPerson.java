package org.example.OOP_basic.IO.serialization;

public class SeriallizedPerson {
    private transient int id;
    private String name;
    private String surname;
    private int age;

    public SeriallizedPerson(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  String getFullName()
    {

        return new StringBuffer(surname)
                .append(" ")
                .append(name)
                .append(surname)
                .toString();


    }

    @Override
    public String toString() {
        return "SeriallizedPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
