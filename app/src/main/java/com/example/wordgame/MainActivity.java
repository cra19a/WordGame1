package com.example.wordgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "Noun";
    public static final String EXTRA_MESSAGE_2 = "Adjective";
    public static final String EXTRA_MESSAGE_3 = "Verb";
    public static final String EXTRA_MESSAGE_4 = "Professor";
    public static final String EXTRA_MESSAGE_5 = "Athlete";
    public static final String EXTRA_MESSAGE_6 = "Number";
    public static final String EXTRA_MESSAGE_7 = "Food";
    public static final String EXTRA_MESSAGE_8 = "Holiday";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {

        // everything else works except THIS: the data validation right under.
        // worked on it for a while, searched up solutions but just can't get it right.
            //if (TextUtils.isEmpty(editText.getText().toString())) {

            Intent intent = new Intent(this, DisplayMessageActivity.class);

            // noun
            EditText editText = (EditText) findViewById(R.id.EditNoun);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);

            // adjective
            EditText editText2 = (EditText) findViewById(R.id.EditAdjective);
            String message2 = editText2.getText().toString();
            intent.putExtra(EXTRA_MESSAGE_2, message2);

            // verb
            EditText editText3 = (EditText) findViewById(R.id.EditVerb);
            String message3 = editText3.getText().toString();
            intent.putExtra(EXTRA_MESSAGE_3, message3);

            // professor
            EditText editText4 = (EditText) findViewById(R.id.EditProfessor);
            String message4 = editText4.getText().toString();
            intent.putExtra(EXTRA_MESSAGE_4, message4);

            // athlete
            EditText editText5 = (EditText) findViewById(R.id.EditAthlete);
            String message5 = editText5.getText().toString();
            intent.putExtra(EXTRA_MESSAGE_5, message5);

            // number
            EditText editText6 = (EditText) findViewById(R.id.EditNumber);
            String message6 = editText6.getText().toString();
            intent.putExtra(EXTRA_MESSAGE_6, message6);

            // food
            EditText editText7 = (EditText) findViewById(R.id.EditFood);
            String message7 = editText7.getText().toString();
            intent.putExtra(EXTRA_MESSAGE_7, message7);

            // holiday
            EditText editText8 = (EditText) findViewById(R.id.EditHoliday);
            String message8 = editText8.getText().toString();
            intent.putExtra(EXTRA_MESSAGE_8, message8);

            startActivity(intent);
        // }

        // else {
        //    return;
        // }
    }
}