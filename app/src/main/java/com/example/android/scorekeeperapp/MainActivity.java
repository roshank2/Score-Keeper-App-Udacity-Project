package com.example.android.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
        Global variable for keep track of team A score..
     */
    private int scoreTeamA = 0;

    /*
        Global variable for keep track of team B score..
     */
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Method for Field Goal button for Team A.
        It will increment scoreTeamA by 3.
     */
    public void fieldGoalA(View view) {
        scoreTeamA += 3;
        displayTeamAScore();
    }

    /*
        Method for Touchdown button for Team A.
        It will increment scoreTeamA by 6.
     */
    public void touchDownA(View view) {
        scoreTeamA += 6;
        displayTeamAScore();
    }

    /*
        Method for Safety button for Team A.
        It will increment scoreTeamA by 2.
     */
    public void safetyA(View view) {
        scoreTeamA += 2;
        displayTeamAScore();
    }

    /*
    Method for Field Goal button for Team B.
    It will increment scoreTeamB by 3.
 */
    public void fieldGoalB(View view) {
        scoreTeamB += 3;
        displayTeamBScore();
    }

    /*
        Method for Touchdown button for Team B.
        It will increment scoreTeamB by 6.
     */
    public void touchDownB(View view) {
        scoreTeamB += 6;
        displayTeamBScore();
    }

    /*
        Method for Safety button for Team B.
        It will increment scoreTeamB by 2.
     */
    public void safetyB(View view) {
        scoreTeamB += 2;
        displayTeamBScore();
    }

    /*
        Method for Reset button. It will set scores back to 0.
     */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamAScore();
        displayTeamBScore();
    }

    /*
        Method for displaying Team A Score
     */
    private void displayTeamAScore() {
        TextView teamAScore = findViewById(R.id.team_a_score);
        teamAScore.setText("" + scoreTeamA);
    }

    /*
        Method for displaying Team B Score
     */
    private void displayTeamBScore() {
        TextView teamAScore = findViewById(R.id.team_b_score);
        teamAScore.setText("" + scoreTeamB);
    }

}
