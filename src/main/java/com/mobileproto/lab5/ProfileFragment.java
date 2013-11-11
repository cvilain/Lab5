package com.mobileproto.lab5;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

/**
 * Created by Chloe Local on 11/4/13.
 */
public class ProfileFragment extends Fragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.profile_fragment, null);
        final SeekBar sizeBar = (SeekBar) v.findViewById(R.id.seekBarSize);
        final SeekBar techBar = (SeekBar) v.findViewById(R.id.seekBarTech);
        sizeBar.setProgress(50);
        techBar.setProgress(50);
        return v;
    }
}
