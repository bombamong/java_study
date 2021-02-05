package com.company;

public abstract class Team<T> implements Comparable<Team<T>>{
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return (won * 2) - lost + tied;
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team<T> opponent) {
        return (this.getRanking() - opponent.getRanking());
    }
}
