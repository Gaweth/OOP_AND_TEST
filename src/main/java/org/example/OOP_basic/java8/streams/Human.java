package org.example.OOP_basic.java8.streams;

public class Human implements Comparable<Human> {
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Human(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, String surname, int age, String genderShortcutPl) {
        this.name = name;
        this.surname = surname;
        this.age = age;
       this.gender = gender.getShortcutPl(genderShortcutPl);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isOVer20AndMan()
    {
        return  age > 20 && "M".equals(getGender().getShortcutPl());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender.getTranslationPl() +
                '}';
    }
    @Override
    public int compareTo(Human o) {
        return surname.compareTo(o.getSurname());

    }

    public static Gender getByShortcutPl ( String shortcutPl){
        for ( Gender gender : Gender.values())
        {
            if ( shortcutPl.equals((getByShortcutPl())))
            {
                return gender;
            }
        }
        return null;
    }




}
