package org.example.OOP_basic.interfaces;

public class Programmer implements  OOPCoding{

    @Override
    public void codeOOP(String language) {
        System.out.println("its obj oriented lang ");
    }

    @Override
    public void code(String language) {
        System.out.println("im codding " + language);
    }
}
