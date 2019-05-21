package com.example.azadt.deutournament;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // "_" ile yazılmış değişkenler java dosyaları içinde programcının kullandığı değişkenler
    // "Camel" yöntemiyle adlandırılmış değişkenler program içindeki widgetların isimleri
    Button stop_button, play_button, make_competitions_button, about_app_button;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about_app_button = findViewById(R.id.aboutButton);
        about_app_button.setOnClickListener(this);
        make_competitions_button = findViewById(R.id.competitionsButton);
        make_competitions_button.setOnClickListener(this);
        play_button = findViewById(R.id.playButtonMain);
        play_button.setOnClickListener(this);
        stop_button = findViewById(R.id.stopButtonMain);
        stop_button.setOnClickListener(this);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music);
        if(mediaPlayer.isPlaying() == false)
            mediaPlayer.start();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if(v.getId() == play_button.getId() && mediaPlayer.isPlaying() == false){
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music);
            mediaPlayer.start();
        }
        else if(v.getId() == stop_button.getId()){
            mediaPlayer.stop();
        }
        else if(v.getId() == about_app_button.getId()){
            intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == make_competitions_button.getId()){
            intent = new Intent(MainActivity.this, FixtureActivity.class);
            startActivity(intent);
        }
    }


}
