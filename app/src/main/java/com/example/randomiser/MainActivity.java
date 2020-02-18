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
        rollButton = (Button) findViewById(R.id.rollButton);
        resultsTextView = (TextView) findViewById(R.id.resultsTextView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        //specify what happens when the roll button is pressed
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rand = new Random().nextInt(seekBar.getProgress()) + 1;
                resultsTextView.setText(Integer.toString(rand));
            }
        });
    }
}
