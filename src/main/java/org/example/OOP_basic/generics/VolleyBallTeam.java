package org.example.OOP_basic.generics;

public class VolleyBallTeam extends Team{
    private TeamLevel teamLevel;

    public VolleyBallTeam(String name, TeamLevel teamLevel) {
        super(name);
        this.teamLevel = teamLevel;
    }

    public TeamLevel getTeamLevel() {
        return teamLevel;
    }

    @Override
    public String getName() {
        return "siatkarska druzyna " + getName();
    }
}

