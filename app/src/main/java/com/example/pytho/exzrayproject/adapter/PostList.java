package com.example.pytho.exzrayproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pytho.exzrayproject.R;

public class PostList extends RecyclerView.Adapter<PostList.VH> {

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_post, viewGroup, false);

        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH vh, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class VH extends RecyclerView.ViewHolder {

        private ImageView image_post;
        private ImageView image_profile;

        private TextView text_name;
        private TextView text_date;
        private TextView text_description;

        private VH(@NonNull View itemView) {
            super(itemView);

            image_post = itemView.findViewById(R.id.post_image_post);
            image_profile = itemView.findViewById(R.id.post_image_profile);

            text_name = itemView.findViewById(R.id.post_text_name);
            text_date = itemView.findViewById(R.id.post_text_datetime);
            text_description = itemView.findViewById(R.id.post_text_description);
        }
    }
}
