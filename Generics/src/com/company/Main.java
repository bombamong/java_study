package com.company;

public class Main {

//    public static void main(String[] args) {
//        FootBallPlayer joe = new FootBallPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//        Team<FootBallPlayer> team = new Team<>("Dream Team");
//        team.addPlayer(joe);
////        team.addPlayer(pat);
////        team.addPlayer(beckham);
//
//        System.out.println(team.numPlayers());
////
////        ArrayList<Integer> items = new ArrayList<>();
////        items.add(1);
////        items.add(2);
////        items.add(3);
////        items.add(4);
////        items.add(5);
////        items.add(6);
////        items.add(7);
////
////        printDoubled(items);
//        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
//        baseballTeam.addPlayer(pat);
//
//        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer(beckham);
//    }
//
////    private static void printDoubled(ArrayList<Integer> n) {
////        for(int i : n) {
////            System.out.println(i * 2);
////        }
////    }
//}

    public static void main(String[] args) {
        League<Team<FootBallPlayer>> league = new League<>("League");
        Team<FootBallPlayer> team1 = new Team<>("FBteam1");
        Team<FootBallPlayer> team2 = new Team<>("FBteam2");
        Team<FootBallPlayer> team3 = new Team<>("FBteam3");
        Team<FootBallPlayer> team4 = new Team<>("FBteam4");

        Team<BaseballPlayer> teamR = new Team<>("BBteam1");

        league.add(team1);
        league.add(team2);
        league.add(team3);
        league.add(team4);

//      Cant add baseball team using generics;
//      league.add(teamR);

        team1.matchResult(team2, 2, 4);
        team1.matchResult(team3, 1, 5);
        team1.matchResult(team4, 7, 1);
        team1.matchResult(team2, 1, 0);
        team1.matchResult(team3, 1, 0);
        team1.matchResult(team4, 1, 6);

        team2.matchResult(team1, 1, 4);
        team2.matchResult(team3, 4, 1);
        team2.matchResult(team4, 3, 2);
        team2.matchResult(team1, 0, 0);
        team2.matchResult(team3, 1, 0);
        team2.matchResult(team4, 1, 0);

        team3.matchResult(team2, 1, 0);
        team3.matchResult(team4, 1, 3);
        team3.matchResult(team1, 1, 0);
        team3.matchResult(team2, 1, 5);
        team3.matchResult(team4, 1, 1);
        team3.matchResult(team1, 1, 0);

        team4.matchResult(team1, 1, 0);
        team4.matchResult(team2, 1, 1);
        team4.matchResult(team3, 1, 0);
        team4.matchResult(team1, 0, 1);
        team4.matchResult(team2, 1, 0);
        team4.matchResult(team3, 1, 1);

        league.printTeams();
    }
}
