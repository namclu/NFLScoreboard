package com.example.namlu.nflscoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static final int TOUCHDOWN = 6;
    static final int FIELD_GOAL = 3;
    static final int TWO_POINTS = 2;
    static final int EXTRA_POINT = 1;
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
        Button resetButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Code interaction for Team A
         */
        // Add 6 points for touchdown when button is clicked
        touchdownButton = (Button) findViewById(R.id.button_touchdown_a);
        touchdownButton.setOnClickListener(this);

        // Add 3 points for field goal when button is clicked
        fieldGoalButton = (Button) findViewById(R.id.button_field_goal_a);
        fieldGoalButton.setOnClickListener(this);

        // Add 2 points for two point conversion when button is clicked
        twoPointConversionButton = (Button) findViewById(R.id.button_two_point_conversion_a);
        twoPointConversionButton.setOnClickListener(this);

        // Add 1 point for extra point when button is clicked
        extraPointButton = (Button) findViewById(R.id.button_extra_point_a);
        extraPointButton.setOnClickListener(this);

        /*
         * Code interaction for Team B
         */
        // Add 6 points for touchdown when button is clicked
        touchdownButton = (Button) findViewById(R.id.button_touchdown_b);
        touchdownButton.setOnClickListener(this);

        // Add 3 points for field goal when button is clicked
        fieldGoalButton = (Button) findViewById(R.id.button_field_goal_b);
        fieldGoalButton.setOnClickListener(this);

        // Add 2 points for two point conversion when button is clicked
        twoPointConversionButton = (Button) findViewById(R.id.button_two_point_conversion_b);
        twoPointConversionButton.setOnClickListener(this);

        // Add 1 point for extra point when button is clicked
        extraPointButton = (Button) findViewById(R.id.button_extra_point_b);
        extraPointButton.setOnClickListener(this);

        // Reset the score to 0 for both teams when button is clicked
        resetButton = (Button) findViewById(R.id.button_reset);
        resetButton.setOnClickListener(this);
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

    // resetScore() sets the score to 0 for both teams
    public void resetScore() {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    // Implement onClick() method
    @Override
    public void onClick(View view) {
        // Perform action on click
        switch (view.getId()) {
            case R.id.button_touchdown_a:
                scoreTeamA += TOUCHDOWN;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.button_field_goal_a:
                scoreTeamA += FIELD_GOAL;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.button_two_point_conversion_a:
                scoreTeamA += TWO_POINTS;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.button_extra_point_a:
                scoreTeamA += EXTRA_POINT;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.button_touchdown_b:
                scoreTeamB += TOUCHDOWN;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.button_field_goal_b:
                scoreTeamB += FIELD_GOAL;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.button_two_point_conversion_b:
                scoreTeamB += TWO_POINTS;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.button_extra_point_b:
                scoreTeamB += EXTRA_POINT;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.button_reset:
                resetScore();
                break;
        }
    }
}
