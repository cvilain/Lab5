package com.mobileproto.lab5;

import java.util.ArrayList;

/**
 * Created by Chloe Local on 11/3/13.
 */
public class Person {

    private String name;
    private String favoriteClass;
    private String weekend;
    private boolean mentor;
    private boolean mentee;
    private int size;
    private int tech;
    private boolean starred;


    public Person ()
    {


    }
    public Person(String name, String favoriteClass, String weekend,
                  int size, int tech, boolean mentor, boolean mentee,
                  boolean starred){
        this.name = name;
        this.size = size;
        this.tech = tech; //0-100
        this.weekend = weekend;
        this.favoriteClass = favoriteClass;
        this.mentee = mentee;
        this.mentor = mentor;
        this.starred = starred;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteClass() {
        return favoriteClass;
    }

    public void setFavoriteClass(String favoriteClass) {
        this.favoriteClass = favoriteClass;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }

    public boolean isMentor() {
        return mentor;
    }

    public void setMentor(boolean mentor) {
        this.mentor = mentor;
    }

    public boolean isMentee() {
        return mentee;
    }

    public void setMentee(boolean mentee) {
        this.mentee = mentee;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTech() {
        return tech;
    }

    public void setTech(int tech) {
        this.tech = tech;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }
}
