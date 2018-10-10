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
import com.example.pytho.exzrayproject.model.PostModel;


public class MainPostFragment extends Fragment {

    RecyclerView mRecyclerView;
    LinearLayoutManager mManager;

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

        fakeData();

        mManager = new LinearLayoutManager(getContext());
        mRecyclerView = view.findViewById(R.id.post_recycler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(new PostAdapter());
        mRecyclerView.setLayoutManager(mManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), mManager.getOrientation()));
    }

    private void fakeData(){
        PostModel model1 = new PostModel();
        model1.setText_name("Mohd Nazirul Aiman");
        model1.setImage_profile("https://images.unsplash.com/photo-1496345875659-11f7dd282d1d?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=a0f994eef47e5fb1a67849703cc961b3&auto=format&fit=crop&w=1350&q=80");
        model1.setImage_content("https://images.unsplash.com/photo-1483428400520-675ef69a3bc4?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=7df813acb5f2c1f7261ea675d078073f&auto=format&fit=crop&w=1267&q=80");
        model1.setText_posted("Today 1.00am");
        model1.setText_content("My bestie! hang out on sunset.");

        PostModel model2 = new PostModel();
        model2.setText_name("Alice");
        model2.setImage_profile("https://images.unsplash.com/photo-1529932260967-af9d3bbd8138?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b3e872d900875102bc21577a8f6f1345&auto=format&fit=crop&w=634&q=80");
        model2.setImage_content("https://images.unsplash.com/photo-1532909825484-d59b5ced9ac0?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=4ab6289e9568f0007407030b8fd2b922&auto=format&fit=crop&w=1350&q=80");
        model2.setText_posted("Yesterday 10.00am");
        model2.setText_content("Hello world!");

        PostModel model3 = new PostModel();
        model3.setText_name("Johnny Deep");
        model3.setImage_profile("https://images.unsplash.com/photo-1530268729831-4b0b9e170218?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=d7ef5a79190207ccb44c7c2e101e13ed&auto=format&fit=crop&w=1350&q=80");
        model3.setImage_content("https://images.unsplash.com/photo-1534535674105-40d57109f1f6?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=5ab40c690ba2d39c97d6a718dd2062b5&auto=format&fit=crop&w=634&q=80");
        model3.setText_posted("Yesterday 10.00am");
        model3.setText_content("Beautiful world! Nice holiday guys.");

        PostModel model4 = new PostModel();
        model4.setText_name("Mohd Nazirul Aiman");
        model4.setImage_profile("https://images.unsplash.com/photo-1496345875659-11f7dd282d1d?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=a0f994eef47e5fb1a67849703cc961b3&auto=format&fit=crop&w=1350&q=80");
        model4.setImage_content("https://images.unsplash.com/photo-1527427337751-fdca2f128ce5?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=7f0965bc37ef09044780baa8af91e2b3&auto=format&fit=crop&w=1350&q=80");
        model4.setText_posted("Yesterday 10.00am");
        model4.setText_content("Doing my works at office. Pretty cools huh!");
    }
}
