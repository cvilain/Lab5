package com.mobileproto.lab5;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chloe Local on 11/4/13.
 */
public class FavoritesFragment extends Fragment{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.favorites_fragment, null);

        List<Person> people = ((FeedActivity)getActivity()).getFavorites();
        List<FeedItem> sampleData = new ArrayList<FeedItem>();
        for (Person p: people){
            sampleData.add(new FeedItem(p.getName(), p.getName()));
        }


        // Set up the ArrayAdapter for the feedList
        FeedListAdapter feedListAdapter = new FeedListAdapter(this.getActivity(), sampleData);
        ListView feedList = (ListView) v.findViewById(R.id.listView);
        feedList.setAdapter(feedListAdapter);
        return v;
    }
}
