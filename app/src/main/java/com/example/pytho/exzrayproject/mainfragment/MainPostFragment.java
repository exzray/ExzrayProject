package com.example.pytho.exzrayproject.mainfragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pytho.exzrayproject.R;
import com.example.pytho.exzrayproject.adapter.PostAdapter;


public class MainPostFragment extends Fragment {

    RecyclerView mRecyclerView;

    public MainPostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_post, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = view.findViewById(R.id.post_recycler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(new PostAdapter());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), ((LinearLayoutManager) mRecyclerView.getLayoutManager()).getOrientation()));
    }
}
