package org.example.OOP_basic.generics.nonGeneric;

import org.example.OOP_basic.generics.FoodballTeam;
import org.example.OOP_basic.generics.Team;
import org.example.OOP_basic.generics.TeamLevel;
import org.example.OOP_basic.generics.VolleyBallTeam;

public class LeagueMain {
    public static void main(String[] args) {
        League league = new League("Primeria Division");

        Team team1 = new FoodballTeam("FC Barcelona", TeamLevel.PROFFESIONAL);
        Team team2 = new FoodballTeam("Atletico de Madrid", TeamLevel.PROFFESIONAL);
        Team team3 = new FoodballTeam("Real Madrid CF", TeamLevel.PROFFESIONAL);
        Team team4 = new FoodballTeam("Valencia CF", TeamLevel.PROFFESIONAL);
        team1.setPoints(20);
        team2.setPoints(30);
        team3.setPoints(25);
        team4.setPoints(19);
        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam(team3);
        league.addTeam(team4);
        league.printTable();
        System.out.println("======================");
        Team team5 = new VolleyBallTeam("AssecoResovia", TeamLevel.PROFFESIONAL);
        team5.setPoints(20);
        league.addTeam(team5);
        league.printTable();

    }
}
