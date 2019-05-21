package com.example.azadt.deutournament;

import java.util.ArrayList;

public class Fixture {

    ArrayList<Competition> competitions = new ArrayList<>();

    public Fixture(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }

    public ArrayList<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(ArrayList<Competition> competitions) {
        this.competitions = competitions;
    }
}

