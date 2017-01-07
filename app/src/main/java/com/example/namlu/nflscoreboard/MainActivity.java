package com.example.namlu.nflscoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
     * @param scoreTeamA tracks the cumulative score for team A
     * @param scoreTeamB tracks the cumulative score for team B
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Initialize buttons
        Button touchdownButton;
        Button fieldGoalButton;
        Button twoPointConversionButton;
        Button extraPointButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Code interaction for Team A
         */
        // Add 6 points for touchdown when button is clicked
        touchdownButton = (Button) findViewById(R.id.button_touchdown_a);
        touchdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA += 6;
                displayForTeamA(scoreTeamA);
            }
        });

        // Add 3 points for field goal when button is clicked
        fieldGoalButton = (Button) findViewById(R.id.button_field_goal_a);
        fieldGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
            }
        });

        // Add 2 points for two point conversion when button is clicked
        twoPointConversionButton = (Button) findViewById(R.id.button_two_point_conversion_a);
        twoPointConversionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
            }
        });

        // Add 1 point for extra point when button is clicked
        extraPointButton = (Button) findViewById(R.id.button_extra_point_a);
        extraPointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 1;
                displayForTeamA(scoreTeamA);
            }
        });

        /*
         * Code interaction for Team B
         */
        // Add 6 points for touchdown when button is clicked
        touchdownButton = (Button) findViewById(R.id.button_touchdown_b);
        touchdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB += 6;
                displayForTeamB(scoreTeamB);
            }
        });

        // Add 3 points for field goal when button is clicked
        fieldGoalButton = (Button) findViewById(R.id.button_field_goal_b);
        fieldGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
            }
        });

        // Add 2 points for two point conversion when button is clicked
        twoPointConversionButton = (Button) findViewById(R.id.button_two_point_conversion_b);
        twoPointConversionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
            }
        });

        // Add 1 point for extra point when button is clicked
        extraPointButton = (Button) findViewById(R.id.button_extra_point_b);
        extraPointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 1;
                displayForTeamB(scoreTeamB);
            }
        });
    }

    // displayForTeamA() sets the score for team A
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    // displayForTeamB() sets the score for team B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }
}
