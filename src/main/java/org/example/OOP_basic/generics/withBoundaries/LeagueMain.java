package org.example.OOP_basic.generics.withBoundaries;

import org.example.OOP_basic.generics.FoodballTeam;
import org.example.OOP_basic.generics.Team;
import org.example.OOP_basic.generics.TeamLevel;
import org.example.OOP_basic.generics.VolleyBallTeam;

public class LeagueMain {
    public static void main(String[] args) {
        League<FoodballTeam> league = new League("Primeria Division");

        FoodballTeam team1 = new FoodballTeam("FC Barcelona", TeamLevel.PROFFESIONAL);
        FoodballTeam team2 = new FoodballTeam("Atletico de Madrid", TeamLevel.PROFFESIONAL);
        Team team3 = new FoodballTeam("Real Madrid CF", TeamLevel.PROFFESIONAL);
        Team team4 = new FoodballTeam("Valencia CF", TeamLevel.PROFFESIONAL);
        team1.setPoints(20);
        team2.setPoints(30);
        team3.setPoints(25);
        team4.setPoints(19);
        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam((FoodballTeam) team3);
        league.addTeam((FoodballTeam) team4);
        league.printTable();
        System.out.println("======================");
        VolleyBallTeam team5 = new VolleyBallTeam("AssecoResovia", TeamLevel.PROFFESIONAL);
        team5.setPoints(20);
//        league.addTeam((VolleyBallTeam) team5);
//        league.printTable();

        Team team6 = new VolleyBallTeam("zalsa", TeamLevel.PROFFESIONAL);
        team6.setPoints(35);
        league.addTeam((FoodballTeam) team6);

        league.printTable();




    }
}
