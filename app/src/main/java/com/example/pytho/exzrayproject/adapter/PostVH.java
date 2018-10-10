package com.example.pytho.exzrayproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pytho.exzrayproject.R;

public class PostVH extends RecyclerView.ViewHolder {

    public ImageView image_post;
    public ImageView image_profile;

    public TextView text_name;
    public TextView text_date;
    public TextView text_description;

    public PostVH(@NonNull View itemView) {
        super(itemView);

        image_post = itemView.findViewById(R.id.post_image_post);
        image_profile = itemView.findViewById(R.id.post_image_profile);

        text_name = itemView.findViewById(R.id.post_text_name);
        text_date = itemView.findViewById(R.id.post_text_datetime);
        text_description = itemView.findViewById(R.id.post_text_description);
    }
}
