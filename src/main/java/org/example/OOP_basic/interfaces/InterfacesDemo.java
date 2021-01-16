package org.example.OOP_basic.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        User user = new User("wiedzmin 3");
        user.playGame();
        user.code("C#");

        Coding coder = new User("rdr2");
        coder.code("java");
        //rzutowanie zeby wywolac playGame
        ((User) coder).playGame();

    }
}
