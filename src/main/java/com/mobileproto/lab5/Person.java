package com.mobileproto.lab5;

import java.util.ArrayList;

/**
 * Created by Chloe Local on 11/3/13.
 */
public class Person {

    String name;
    String favoriteClass;
    String weekend;
    boolean mentor;
    boolean mentee;
    int size;
    int tech;
    boolean starred;


    public Person(String name, String favoriteClass, String weekend,
                  int size, int tech, boolean mentor, boolean mentee,
                  boolean starred){
        this.name = name;
        this.size = size;
        this.tech = tech;
        this.weekend = weekend;
        this.favoriteClass = favoriteClass;
        this.mentee = mentee;
        this.mentor = mentor;
        this.starred = starred;
    }

}
