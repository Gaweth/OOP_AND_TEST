package org.example.OOP_basic.generics;

public abstract class Team implements Comparable<Team>{
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Team otherTeam) {
        //porownanie druzyn iloscia zdobytych punktow
        return otherTeam.getPoints() - points;
    }
}
