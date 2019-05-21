package com.example.azadt.deutournament;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FixtureActivity extends AppCompatActivity implements View.OnClickListener {

    public static Referee footballReferee = new Referee(32, 80, 180, 5000);
    public static Referee basketballReferee = new Referee(33, 80, 190, 4000);
    public static Referee volleyballReferee = new Referee(30, 82, 170, 5000);
    public static Referee beachVolleyballReferee = new Referee(29, 85, 175, 4500);
    public static Referee handballReferee = new Referee(32, 79, 180, 6000);

    public static Menager computerMenager = new Menager(30, 82, 175, 6000);
    public static Menager environmentalMenager = new Menager(32, 83, 176, 7000);
    public static Menager electricalMenager = new Menager(31, 86, 174, 6000);
    public static Menager industrialMenager = new Menager(29, 84, 175, 6000);
    public static Menager civilMenager = new Menager(30, 82, 175, 6000);
    public static Menager geophysicsMenager = new Menager(30, 82, 175, 6000);
    public static Menager geologyMenager = new Menager(30, 82, 175, 5000);
    public static Menager miningMenager = new Menager(30, 82, 175, 6000);
    public static Menager mechanicalMenager = new Menager(30, 82, 175, 6000);
    public static Menager metallurgicalMenager = new Menager(30, 82, 175, 6000);
    public static Menager textileMenager = new Menager(30, 82, 175, 6000);

    public static Player[] computerPlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    public static Player[] environmentalPlayers = {new Player(20, 70, 178, "silver"),
            new Player(21, 70, 172, "silver"), new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"),
            new Player(22, 71, 170, "silver"), new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"),
            new Player(21, 72, 179, "silver"), new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"),
            new Player(20, 71, 178, "silver"),};

    public static Player[] electricalPlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    public static Player[] industrialPlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    public static Player[] civilPlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    public static Player[] geophysicsPlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    public static Player[] geologyPlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    public static Player[] miningPlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    public static Player[] mechanicalPlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    public static Player[] metallurgicalPlayers = {new Player(20, 70, 178, "silver"),
            new Player(21, 70, 172, "silver"), new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"),
            new Player(22, 71, 170, "silver"), new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"),
            new Player(21, 72, 179, "silver"), new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"),
            new Player(20, 71, 178, "silver"),};

    public static Player[] textilePlayers = {new Player(20, 70, 178, "silver"), new Player(21, 70, 172, "silver"),
            new Player(20, 75, 180, "silver"), new Player(21, 70, 182, "silver"), new Player(22, 71, 170, "silver"),
            new Player(23, 72, 174, "silver"), new Player(22, 76, 178, "silver"), new Player(21, 72, 179, "silver"),
            new Player(20, 74, 176, "silver"), new Player(22, 73, 179, "silver"), new Player(20, 71, 178, "silver"),};

    ArrayList<Team> teams;
    ArrayList<Competition> competitions;

    public void init() {
        teams = new ArrayList<>();
        teams.add(new Team("Computer Engineering", computerMenager, computerPlayers));
        teams.add(new Team("Environmental Engineering", environmentalMenager, environmentalPlayers));
        teams.add(new Team("Electrical Engineering", electricalMenager, electricalPlayers));
        teams.add(new Team("Industrial Engineering", industrialMenager, industrialPlayers));
        teams.add(new Team("Civil Engineering", civilMenager, civilPlayers));
        teams.add(new Team("Geophysics Engineering", geophysicsMenager, geophysicsPlayers));
        teams.add(new Team("Geology Engineering", geologyMenager, geologyPlayers));
        teams.add(new Team("Mining Engineering", miningMenager, miningPlayers));
        teams.add(new Team("Mechanical Engineering", mechanicalMenager, mechanicalPlayers));
        teams.add(new Team("Metallurgical Engineering", metallurgicalMenager, metallurgicalPlayers));
        teams.add(new Team("Textile Engineering", textileMenager, textilePlayers));

        competitions = new ArrayList<>();
        competitions.add(new Competition("Football", footballReferee, 3));
        competitions.add(new Competition("Basketball", basketballReferee, 2));
        competitions.add(new Competition("Volleyball", volleyballReferee, 3));
        competitions.add(new Competition("Beach volleyball", beachVolleyballReferee, 3));
        competitions.add(new Competition("Hentbol", handballReferee, 2));
    }

    Button football_button, basketball_button, volleyball_button, beachvolleyball_button, handball_button;
    MediaPlayer mediaPlayer;
    TextView result_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixture);
        football_button = findViewById(R.id.footballButton);
        football_button.setOnClickListener(this);
        basketball_button = findViewById(R.id.basketballButton);
        basketball_button.setOnClickListener(this);
        volleyball_button = findViewById(R.id.volleyBallButton);
        volleyball_button.setOnClickListener(this);
        beachvolleyball_button = findViewById(R.id.beachVolleyballButton);
        beachvolleyball_button.setOnClickListener(this);
        handball_button = findViewById(R.id.handballButton);
        handball_button.setOnClickListener(this);
        result_text = findViewById(R.id.resultText);
        init();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == football_button.getId()) {
            result_text.setText("");
            result_text.setText(competitions.get(0).makeCompetition(teams));
        } else if (v.getId() == basketball_button.getId()) {
            result_text.setText("");
            result_text.setText(competitions.get(1).makeCompetition(teams));
        } else if (v.getId() == volleyball_button.getId()) {
            result_text.setText("");
            result_text.setText(competitions.get(2).makeCompetition(teams));
        } else if (v.getId() == beachvolleyball_button.getId()) {
            result_text.setText("");
            result_text.setText(competitions.get(3).makeCompetition(teams));
        } else if (v.getId() == handball_button.getId()) {
            result_text.setText("");
            result_text.setText(competitions.get(4).makeCompetition(teams));
        }
    }
}
