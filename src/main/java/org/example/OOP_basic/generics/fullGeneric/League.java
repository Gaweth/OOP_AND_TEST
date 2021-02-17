package org.example.OOP_basic.generics.fullGeneric;

import org.example.OOP_basic.generics.Team;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class League<T>{
    private String leagueName;
    private List<T> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
    }


    public boolean addTeam(T team)
    {
        if (!teams.contains(team))
        {
         return teams.add(team);
        }
        return false;
    }

    public void printTable()
    {
        Collections.sort((List<Team>) teams);
        System.out.println(leagueName + " table");
        teams.forEach(x-> System.out.println(((Team) x).getName() + " "+ ((Team) x).getPoints()));
    }

}
