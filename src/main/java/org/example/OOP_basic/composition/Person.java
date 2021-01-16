package org.example.OOP_basic.composition;

public class Person {
    private String firtName;
    private String lastName;

    private String street;
    private String city;
    private String county;

    private Adress homeAdress;
    private Adress workAdress;
    private Adress schoolAdress;

    public Person(String firtName, String lastName) {
        this.firtName = firtName;
        this.lastName = lastName;
    }



    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public void addHomeAdress( String street, String city , String county){
        this.homeAdress = new Adress(street, city, county);
        }
    public String getAdress()
    {
        return street + " " + city + county;
    }

}
