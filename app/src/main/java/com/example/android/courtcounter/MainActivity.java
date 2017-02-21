package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Displays the given score for Team A.
     */
    // Global Variable for Scores
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    //End of Global Variables
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Team A
    public void addThreeForTeamA(View V) {
        scoreTeamA=scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View V) {
        scoreTeamA=scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View V) {
        scoreTeamA=scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
//Team B
public void addThreeForTeamB(View V) {
    scoreTeamB=scoreTeamB + 3;
    displayForTeamB(scoreTeamB);
}

    public void addTwoForTeamB(View V) {
        scoreTeamB=scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View V) {
        scoreTeamB=scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
}
