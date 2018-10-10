package com.example.pytho.exzrayproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.pytho.exzrayproject.R;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostVH> {

    @NonNull
    @Override
    public PostVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_post, viewGroup, false);

        return new PostVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostVH postVH, int i) {
        Glide
                .with(postVH.itemView.getContext())
                .load("https://images.unsplash.com/photo-1526927071144-dbe4c41835e4?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=aa5c3146c2a570c1b15c124e38bdd94f&auto=format&fit=crop&w=1350&q=80")
                .into(postVH.image_profile);

        Glide
                .with(postVH.itemView.getContext())
                .load("https://images.unsplash.com/photo-1483428400520-675ef69a3bc4?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=7df813acb5f2c1f7261ea675d078073f&auto=format&fit=crop&w=1267&q=80")
                .into(postVH.image_post);
    }

    @Override
    public int getItemCount() {
        return 5;
    }


    class PostVH extends RecyclerView.ViewHolder {

        private ImageView image_post;
        private ImageView image_profile;

        private TextView text_name;
        private TextView text_date;
        private TextView text_description;

        private PostVH(@NonNull View itemView) {
            super(itemView);

            image_post = itemView.findViewById(R.id.post_image_post);
            image_profile = itemView.findViewById(R.id.post_image_profile);

            text_name = itemView.findViewById(R.id.post_text_name);
            text_date = itemView.findViewById(R.id.post_text_datetime);
            text_description = itemView.findViewById(R.id.post_text_description);
        }
    }
}
