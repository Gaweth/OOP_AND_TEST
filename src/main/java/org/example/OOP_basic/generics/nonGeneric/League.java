package org.example.OOP_basic.generics.nonGeneric;

import org.example.OOP_basic.generics.Team;

import java.util.Collections;
import java.util.List;


public class League {
    private String leagueName;
    private List<Team> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = teams;
    }





    public boolean addTeam(Team team)
    {
        if (!teams.contains(team))
        {
         return teams.add(team);
        }
        return false;
    }

    public void printTable()
    {
        Collections.sort(teams);
        System.out.println(leagueName + " table");
        teams.forEach( x-> System.out.println(x.getName() + " "+ x.getPoints()));
    }



}
