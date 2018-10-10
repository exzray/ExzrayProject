package com.example.pytho.exzrayproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pytho.exzrayproject.R;

public class PostAdapter extends RecyclerView.Adapter<PostVH> {

    @NonNull
    @Override
    public PostVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_post, viewGroup, false);

        return new PostVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostVH postVH, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
