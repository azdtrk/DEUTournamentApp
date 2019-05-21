package com.example.azadt.deutournament;

import java.util.ArrayList;
import java.util.Random;

public class Competition {

    String branchName;
    ArrayList<Team> finalists, competitors;
    Team leader;
    Referee referee;
    int point;

    public Competition(String branchName, Referee referee, int point) {
        this.branchName = branchName;
        this.referee = referee;
        this.point = point;
        finalists = new ArrayList<>();
        competitors = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<Team> getFinalists() {
        return finalists;
    }

    public void setFinalists(ArrayList<Team> finalists) {
        this.finalists = finalists;
    }

    public ArrayList<Team> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(ArrayList<Team> competitors) {
        this.competitors = competitors;
    }

    public Team getLeader() {
        return leader;
    }

    public void setLeader(Team leader) {
        this.leader = leader;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public String makeCompetition(ArrayList<Team> teams) {
        String result = "";
        int size, indexX, indexY, indicator;
        Random random = new Random();
        size = teams.size();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        while (size != 1) {
            indexX = 0;
            indexY = 0;
            while(indexX == indexY) {  // randomla aynı sayı gelme ihtimalini önledik
                indexX = random.nextInt(size);
                indexY = random.nextInt(size);
            }
            // kazanan finale kalır, maçlar kaydedilir ve kaybeden silinir
            indicator = random.nextInt(2);
            if (indicator == 0) { // 1. kazandı ikinciyi at
                teams.get(indexX).setPoints(teams.get(indexX).getPoints() + point);
                teams.get(indexX).setNumberOfWin(teams.get(indexX).getNumberOfWin() + 1);
                teams.get(indexX).setIsWinner(true);
                finalists.add(teams.get(indexX)); // kazanan finale kalır
            } else { // 2. kazandı birinciyi at
                teams.get(indexY).setPoints(teams.get(indexY).getPoints() + point);
                teams.get(indexY).setNumberOfWin(teams.get(indexY).getNumberOfWin() + 1);
                teams.get(indexY).setIsWinner(true);
                finalists.add(teams.get(indexY)); // kazanan finale kalır
            }
            competitors.add(teams.get(indexX));   // kapışanlar her durumda competitors arrayine eklenecek
            competitors.add(teams.get(indexY));
            result += teams.get(indexX).getName() + " vs " + teams.get(indexY).getName();
            if(teams.get(indexX).getIsWinner() == true)
                result += " Winner: " + teams.get(indexX).getName();
            else if(teams.get(indexY).getIsWinner() == true)
                result += " Winner: " + teams.get(indexY).getName();
            result += " Scores are: " + teams.get(indexX).getPoints() + " " + teams.get(indexY).getPoints() + "\n";

            // burada x y den büyükse farklı y x den büyükse farklı şeyler yapman lazım
            if(indexX > indexY) {
                teams.remove(indexX);
                teams.remove(indexY);
            } else {
                teams.remove(indexY);
                teams.remove(indexX);
            }
            size = teams.size();
        }////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (finalists.size() != 1)
            makeCompetition(finalists);
        else {
            leader = finalists.get(0);
            leader.setNumberOfLeadership(leader.getNumberOfLeadership() + 1);
            result += "Leader is: " + leader.getName();
        }
        return result;
    }

    public void listCompetitors() {
        System.out.println("------------------Competitions---------------------");
        for (int i = 0; i < competitors.size(); i += 2) {
            if (i != competitors.size() - 1) {
                System.out.print("Between: " + competitors.get(i).getName() + " vs " + competitors.get(i + 1).getName());
                if (competitors.get(i).getIsWinner() == true) {
                    System.out.print(" Winner is: " + competitors.get(i).getName());
                } else if(competitors.get(i + 1).getIsWinner() == true)
                    System.out.print(" Winner is: " + competitors.get(i).getName());
                System.out.print(" Scores: " + competitors.get(i).getPoints() + " vs " + competitors.get(i + 1).getPoints());
                System.out.println();
            }
        }
    }

}
