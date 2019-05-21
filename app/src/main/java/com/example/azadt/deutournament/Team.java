package com.example.azadt.deutournament;

public class Team {

    String name;
    Menager menager;
    Player[] players;
    int points;
    int NumberOfWin, numberOfLeadership;
    Boolean isWinner;

    public Team(String name, Menager menager, Player[] players) {
        this.name = name;
        this.menager = menager;
        this.players = players;
        isWinner = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menager getMenager() {
        return menager;
    }

    public void setMenager(Menager menager) {
        this.menager = menager;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNumberOfWin() {
        return NumberOfWin;
    }

    public void setNumberOfWin(int numberOfWin) {
        NumberOfWin = numberOfWin;
    }

    public int getNumberOfLeadership() {
        return numberOfLeadership;
    }

    public void setNumberOfLeadership(int numberOfLeadership) {
        this.numberOfLeadership = numberOfLeadership;
    }

    public Boolean getIsWinner() {
        return isWinner;
    }

    public void setIsWinner(Boolean isWinner) {
        this.isWinner = isWinner;
    }

}

