package com.example.android.soccerfootballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.soccerfootballcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Team A goal button is clicked
     */
    public void teamAAddOne(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the Team A yellow card button is clicked
     */
    public void teamAAddOneYellow(View view) {
        yellowTeamA = yellowTeamA + 1;
        displayForTeamAYellow(yellowTeamA);
    }

    /**
     * This method is called when the Team A red card button is clicked
     */
    public void teamAAddOneRed(View view) {
        redTeamA = redTeamA + 1;
        displayForTeamARed(redTeamA);
    }

    /**
     * This method is called when the Team B goal button is clicked
     */
    public void teamBAddOne(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the Team B yellow card button is clicked
     */
    public void teamBAddOneYellow(View view) {
        yellowTeamB = yellowTeamB + 1;
        displayForTeamBYellow(yellowTeamB);
    }

    /**
     * This method is called when the Team B red card button is clicked
     */
    public void teamBAddOneRed(View view) {
        redTeamB = redTeamB + 1;
        displayForTeamBRed(redTeamB);
    }

    /**
     * This method is called when the Reset button is clicked
     */
    public void scoreReset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamAYellow(yellowTeamA);
        displayForTeamBYellow(yellowTeamB);
        displayForTeamARed(redTeamA);
        displayForTeamBRed(redTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayForTeamAYellow(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayForTeamARed(int red) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayForTeamBYellow(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(yellow));
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayForTeamBRed(int red) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(red));
    }

}

