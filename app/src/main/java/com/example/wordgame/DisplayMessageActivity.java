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
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        Intent intent2 = getIntent();
        String message2 = intent2.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        TextView textView2 = findViewById(R.id.textView2);
        textView.setText(message2);

        Intent intent3 = getIntent();
        String message3 = intent3.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        TextView textView3 = findViewById(R.id.textView3);
        textView.setText(message3);

        Intent intent4 = getIntent();
        String message4 = intent4.getStringExtra(MainActivity.EXTRA_MESSAGE4);
        TextView textView4 = findViewById(R.id.textView4);
        textView.setText(message4);

        Intent intent5 = getIntent();
        String message5 = intent5.getStringExtra(MainActivity.EXTRA_MESSAGE5);
        TextView textView5 = findViewById(R.id.textView5);
        textView.setText(message5);

        Intent intent6 = getIntent();
        String message6 = intent6.getStringExtra(MainActivity.EXTRA_MESSAGE6);
        TextView textView6 = findViewById(R.id.textView6);
        textView.setText(message6);

        Intent intent7 = getIntent();
        String message7 = intent7.getStringExtra(MainActivity.EXTRA_MESSAGE7);
        TextView textView7 = findViewById(R.id.textView7);
        textView.setText(message7);

        Intent intent8 = getIntent();
        String message8 = intent8.getStringExtra(MainActivity.EXTRA_MESSAGE8);
        TextView textView8 = findViewById(R.id.textView8);
        textView.setText(message8);

    }
}