package org.example.OOP_basic.generics.withBoundaries;

import org.example.OOP_basic.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class League<T extends Team> {
    private String leagueName;
    private List<T> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
    }


    public boolean addTeam(T team) {
        if (!teams.contains(team)) {
            return teams.add(team);
        }
        return false;
    }

    public void printTable() {
        Collections.sort((List<Team>) teams);
        System.out.println(leagueName + " table");
        teams.forEach(x -> System.out.println(x.getName() + " " + x.getPoints()));

    }

}