package org.example.OOP_basic.interfaces;

public class User implements Gaming, Coding {
    String game;

    public User(String game) {
        this.game = game;
    }

    @Override
    public void code(String language) {
        System.out.println("im codding " + language);
    }



    @Override
    public void playGame() {
            System.out.println("playing "+game);
        }
    }

