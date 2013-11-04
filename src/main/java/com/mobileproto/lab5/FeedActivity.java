package com.mobileproto.lab5;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Define view fragments
        FeedFragment feedFragment = new FeedFragment();
        ConnectionFragment connectionFragment = new ConnectionFragment();
        SearchFragment searchFragment = new SearchFragment();
        GameFragment gameFragment = new GameFragment();
        ProfileFragment profileFragment = new ProfileFragment();
        FavoritesFragment favoritesFragment = new FavoritesFragment();


        /*
         *  The following code is used to set up the tabs used for navigation.
         *  You shouldn't need to touch the following code.
         */
        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);


        ActionBar.Tab feedTab = actionBar.newTab().setText("QuickMatch");
        feedTab.setTabListener(new NavTabListener(gameFragment));

        ActionBar.Tab connectionTab = actionBar.newTab().setText("Favorites");
        connectionTab.setTabListener(new NavTabListener(favoritesFragment));

        ActionBar.Tab searchTab = actionBar.newTab().setText("My Profile");
        searchTab.setTabListener(new NavTabListener(profileFragment));

        actionBar.addTab(feedTab);
        actionBar.addTab(connectionTab);
        actionBar.addTab(searchTab);

        actionBar.setStackedBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.android_dark_blue)));
        buildFavorites();

    }

    ArrayList<Person> favorites;

    public void buildFavorites(){
        favorites = new ArrayList<Person>();
    }
    public ArrayList<Person> getFavorites(){
        return favorites;
    }

    public void addFavorite(Person p){
        favorites.add(p);
    }


}
