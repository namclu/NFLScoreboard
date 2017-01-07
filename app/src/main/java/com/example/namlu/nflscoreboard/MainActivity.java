package com.example.namlu.nflscoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Initialize buttons
        Button touchdownButton;
        Button fieldGoalButton;
        Button twoPointConversionButton;
        Button extraPointButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add 6 points for touchdown when button is clicked
        touchdownButton = (Button) findViewById(R.id.button_touchdown);
        touchdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayForTeamA(6);
            }
        });

        // Add 3 points for field goal when button is clicked
        fieldGoalButton = (Button) findViewById(R.id.button_fieldgoal);
        fieldGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayForTeamA(3);
            }
        });

        // Add 2 points for two point conversion when button is clicked
        twoPointConversionButton = (Button) findViewById(R.id.button_two_point_conversion);
        twoPointConversionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayForTeamA(2);
            }
        });

        // Add 1 point for extra point when button is clicked
        extraPointButton = (Button) findViewById(R.id.button_extra_point);
        extraPointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayForTeamA(1);
            }
        });
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
