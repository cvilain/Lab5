package com.mobileproto.lab5;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.GestureDetector;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Chloe Local on 10/31/13.
 */
public class GameFragment extends Fragment {



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    Person p;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.game_fragment, null);

        final TextView userName = (TextView) v.findViewById(R.id.user_name);
        final TextView answerFirst = (TextView) v.findViewById(R.id.userdata_1);
        final TextView answerSecond = (TextView) v.findViewById(R.id.userdata_2);
        final TextView answerThird = (TextView) v.findViewById(R.id.userdata_3);
        final TextView answerFourth = (TextView) v.findViewById(R.id.userdata_4);
        final ImageView userPicture = (ImageView) v.findViewById(R.id.user_picture);
        final ImageButton starButton = (ImageButton) v.findViewById(R.id.imageButton);
        final SeekBar sizeBar = (SeekBar) v.findViewById(R.id.seekBarSize);
        final SeekBar techBar = (SeekBar) v.findViewById(R.id.seekBarTech);

        sizeBar.setEnabled(false);
        techBar.setEnabled(false);

        userName.setText("Chloe Vilain");
        answerFirst.setText("My favorite required Olin class is UOCD");
        answerSecond.setText("On a weekend night, I'm hanging out with friends");
        answerThird.setText("Mentee");


        starButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent in = new Intent(getActivity(), NewUserActivity.class);
                Log.d("Chloe", "Starting the new activity");s
                startActivity(in);*/
                ((FeedActivity)getActivity()).addFavorite(p);
            }
        });

        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                p = getNewPerson();
                if (p!= null){
                userName.setText(p.name);
                answerFirst.setText("My favorite Olin Requirement is " + p.favoriteClass);
                answerSecond.setText("On a weekend I am " + p.weekend);
                sizeBar.setProgress(p.size);
                techBar.setProgress(p.tech);
                if (p.mentee == true){
                    if (p.mentor == true) {
                        answerThird.setText("Mentor, Mentee");
                    }
                    answerThird.setText("Mentee");
                }
                else {
                    answerThird.setText("Mentor");
                }
                }

                Log.d("Chloe", "detected");
                return false;
            }
        });

        return v;
    }
    public Person getNewPerson(){
        return null;
    }
    public void setAttributes(Person p){

    }
}
