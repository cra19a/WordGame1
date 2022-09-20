package com.example.wordgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.myfirstapp.MESSAGE3";
    public static final String EXTRA_MESSAGE4 = "com.example.myfirstapp.MESSAGE4";
    public static final String EXTRA_MESSAGE5 = "com.example.myfirstapp.MESSAGE5";
    public static final String EXTRA_MESSAGE6 = "com.example.myfirstapp.MESSAGE6";
    public static final String EXTRA_MESSAGE7 = "com.example.myfirstapp.MESSAGE7";
    public static final String EXTRA_MESSAGE8 = "com.example.myfirstapp.MESSAGE8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.EditNoun);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        String message2 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);

        Intent intent3 = new Intent(this, DisplayMessageActivity.class);
        EditText editText3 = (EditText) findViewById(R.id.EditNoun);
        String message3 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);

        Intent intent4 = new Intent(this, DisplayMessageActivity.class);
        EditText editText4 = (EditText) findViewById(R.id.EditNoun);
        String message4 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE4, message4);

        Intent intent5 = new Intent(this, DisplayMessageActivity.class);
        EditText editText5 = (EditText) findViewById(R.id.EditNoun);
        String message5 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE5, message5);

        Intent intent6 = new Intent(this, DisplayMessageActivity.class);
        EditText editText6 = (EditText) findViewById(R.id.EditNoun);
        String message6 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE6, message6);

        Intent intent7 = new Intent(this, DisplayMessageActivity.class);
        EditText editText7 = (EditText) findViewById(R.id.EditNoun);
        String message7 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE7, message7);

        Intent intent8 = new Intent(this, DisplayMessageActivity.class);
        EditText editText8 = (EditText) findViewById(R.id.EditNoun);
        String message8 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE8, message8);
    }
}