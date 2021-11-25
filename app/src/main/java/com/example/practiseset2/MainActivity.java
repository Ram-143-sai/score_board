package com.example.practiseset2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    public int score=0,scoreb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score);
        displayForTeamB(scoreb);
    }
    public void addthree(View view)
    {
        score=score+3;
        displayForTeamA(score);
    }
    public void addtwo(View view)
    {
        score=score+2;
        displayForTeamA(score);
    }
    public void freethrow(View view)
    {
        score=score+1;
        displayForTeamA(score);
    }
    public void addthreeb(View view)
    {
        scoreb=scoreb+3;
        displayForTeamB(scoreb);
    }
    public void addtwob(View view)
    {
        scoreb=scoreb+2;
        displayForTeamB(scoreb);
    }
    public void freethrowb(View view)
    {
        scoreb=scoreb+1;
        displayForTeamB(scoreb);
    }
    public void reset(View view)
    {
        score=0;
        scoreb=0;
        displayForTeamA(score);
        displayForTeamB(scoreb);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}