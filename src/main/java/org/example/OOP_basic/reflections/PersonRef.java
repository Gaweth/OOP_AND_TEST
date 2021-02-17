package org.example.OOP_basic.reflections;

public class PersonRef {
    private int age;
    private String gender;

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    protected String getDetailedGenderInfo()
    {
        return gender.equals("kobieta") ? " Kobiety góra" : "Mezczyzni gora";
    }

    String getAgeSummary()
    {
        return age >= 18 ? "Dorosly" : "Co to wiesz o zyciu";
    }

    private String ageHelper()
    {
        return age > 75 ? "moze pomoc" : "dasz rade";
    }

}
