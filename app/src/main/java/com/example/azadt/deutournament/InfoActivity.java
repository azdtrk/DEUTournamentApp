package com.example.azadt.deutournament;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity{

    TextView info_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        info_text = findViewById(R.id.infoText);
        info_text.setText(R.string.info_about_app);
    }

}
