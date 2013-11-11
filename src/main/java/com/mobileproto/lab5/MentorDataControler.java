package com.mobileproto.lab5;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lego6245 on 11/3/13.
 */
public class MentorDataControler {

    private final String FIREBASE_URL = "https://mentorapp.firebaseio.com/";
    private Firebase ref;
    private List<Person> personList;
    private long last;

    public MentorDataControler(String childName)
    {
        ref = new Firebase(FIREBASE_URL).child(childName);
        personList = new ArrayList<Person>();
        ref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                personList.add(dataSnapshot.getValue(Person.class));
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled() {

            }
        });
    }

    public void putNewEntry(Person p)
    {
        Firebase newPushRef = ref.push();
        newPushRef.setValue(p);
    }

    public Person getEntry()
    {
        long rand = Math.round(Math.random() * personList.size());
        while(last == rand)
        {
            rand = Math.round(Math.random() * personList.size());
        }
        int i = (int)rand;
        last = rand;
        return personList.get(i);
    }

}
