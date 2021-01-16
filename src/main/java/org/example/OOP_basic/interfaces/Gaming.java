package org.example.OOP_basic.interfaces;

public interface Gaming {
    void playGame();
    default boolean isWinter(int points)
    {
        return true;
    }
}
