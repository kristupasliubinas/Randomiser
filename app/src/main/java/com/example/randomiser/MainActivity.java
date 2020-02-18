package com.example.randomiser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rollButton;
    private SeekBar seekBar;
    private TextView resultsTextView;
    private int rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get access to views defined in layout
        rollButton = findViewById(R.id.rollButton);
        resultsTextView = findViewById(R.id.resultsTextView);
        seekBar = findViewById(R.id.seekBar);

        //specify what happens when the roll button is pressed
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(seekBar.getProgress() > 0){
                    rand = new Random().nextInt(seekBar.getProgress() + 2);
                    resultsTextView.setText(Integer.toString(rand));
                } else {
                    resultsTextView.setText(Integer.toString(new Random().nextInt(2)));
                }
            }
        });
    }
}
