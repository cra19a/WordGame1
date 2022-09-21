package com.example.wordgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.EditNoun);
        textView.setText(message);

        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_2);
        TextView textView2 = findViewById(R.id.EditAdjective);
        textView2.setText(message2);

        String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_3);
        TextView textView3 = findViewById(R.id.EditVerb);
        textView3.setText(message3);

        String message4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_4);
        TextView textView4 = findViewById(R.id.EditProfessor);
        textView4.setText(message4);

        String message5 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_5);
        TextView textView5 = findViewById(R.id.EditAthlete);
        textView5.setText(message5);

        String message6 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_6);
        TextView textView6 = findViewById(R.id.EditNumber);
        textView6.setText(message6);

        String message7 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_7);
        TextView textView7 = findViewById(R.id.EditFood);
        textView7.setText(message7);

        String message8 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_8);
        TextView textView8 = findViewById(R.id.EditHoliday);
        textView8.setText(message8);
    }
}