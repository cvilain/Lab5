package com.mobileproto.lab5;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Chloe Local on 11/3/13.
 */
public class NewUserActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_account_activity);


    /*public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) { */
        //View v = getLayoutInflater().inflate(R.layout.new_account_activity, null);

        /*final EditText name = (EditText) findViewById(R.id.user_name);
        final EditText olinRequirement = (EditText) findViewById(R.id.olinRequirement);
        final EditText weekend = (EditText) findViewById(R.id.onWeekend);
        final CheckBox mentor = (CheckBox) findViewById(R.id.checkBoxMentor);
        final CheckBox mentee = (CheckBox) findViewById(R.id.checkBoxBeMentored);
        final Button letsGo = (Button) findViewById(R.id.buttonLetsStart);
        final SeekBar companySizeBar = (SeekBar) findViewById(R.id.seekBarSize);
        final SeekBar techBar = (SeekBar) findViewById(R.id.seekBarSize); */

        //set on-click listener for button

        final Button letsGo = (Button) findViewById(R.id.buttonLetsStart);
        letsGo.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {

                /*
                final EditText name = (EditText) findViewById(R.id.user_name);
                final EditText olinRequirement = (EditText) findViewById(R.id.olinRequirement);
                final EditText weekend = (EditText) findViewById(R.id.onWeekend);
                final CheckBox mentor = (CheckBox) findViewById(R.id.checkBoxMentor);
                final CheckBox mentee = (CheckBox) findViewById(R.id.checkBoxBeMentored);
                final Button letsGo = (Button) findViewById(R.id.buttonLetsStart);
                final SeekBar companySizeBar = (SeekBar) findViewById(R.id.seekBarSize);
                final SeekBar techBar = (SeekBar) findViewById(R.id.seekBarSize);
                String uname = name.getText().toString();
                String favoriteRequ = olinRequirement.getText().toString();
                String onWeekend = weekend.getText().toString();
                int size = companySizeBar.getProgress();
                int tech = techBar.getProgress();
                boolean isMentor = mentor.isChecked();
                boolean isMentee = mentee.isChecked();

                Person me = new Person(uname, favoriteRequ, onWeekend,
                size, tech,  isMentor, isMentee, false);
                //Send person
                */

                Log.d("Chloe", "I've been clicked");
                Intent i = new Intent(getApplicationContext(),FeedActivity.class);
                startActivity(i);
            }
        });


        //Take care of scaling SeekBars

        //Photos?

        /**
         * Takes nothing
         * Make this part functional
         * Send bundle of information when saving
         */
    //}

    }
}

