package com.example.azadt.deutournament;

public class Player extends Human{

    String medal;

    public Player(int age, int weight, int height, String medal) {
        super(age, weight, height);
        this.medal = medal;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }


}

