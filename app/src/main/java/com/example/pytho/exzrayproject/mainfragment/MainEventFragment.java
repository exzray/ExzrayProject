package com.example.pytho.exzrayproject.mainfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pytho.exzrayproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainEventFragment extends Fragment {

    public MainEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_event, container, false);
    }
}
