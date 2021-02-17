package org.example.OOP_basic.generics;

public class FoodballTeam extends Team {
    private TeamLevel teamLevel;

    public FoodballTeam(String name, TeamLevel teamLevel) {
        super(name);
        this.teamLevel = teamLevel;
    }

    public FoodballTeam(String name) {
        super(name);
    }
}
