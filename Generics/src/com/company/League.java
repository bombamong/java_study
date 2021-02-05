package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public boolean add(T newTeam) {
        System.out.println(newTeam.getName());
        if(this.teams.contains(newTeam)){
            System.out.println(newTeam.getName() + " is already a member.");
            return false;
        }
        teams.add(newTeam);
        System.out.println("Added " + newTeam.getName() + " to " + this.name);
        return true;
    }

    public void printTeams() {
        if(this.teams.size() == 0) System.out.println("No teams have joined.");
        Collections.sort(this.teams);
        for(int i = 0; i < this.teams.size(); i++) {
            T current = this.teams.get(i);
            System.out.println("League #" + (i + 1) + ": " + current.getName()
                    + " with a score of " + current.ranking());
        }
    }
}
