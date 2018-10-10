package com.example.pytho.exzrayproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.pytho.exzrayproject.R;
import com.example.pytho.exzrayproject.model.PostModel;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostVH> {

    @NonNull
    @Override
    public PostVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_post, viewGroup, false);

        return new PostVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostVH postVH, int i) {
        // current data
        PostModel model = PostModel.LIST.get(i);

//        "https://images.unsplash.com/photo-1496345875659-11f7dd282d1d?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=a0f994eef47e5fb1a67849703cc961b3&auto=format&fit=crop&w=1350&q=80"
//        "https://images.unsplash.com/photo-1483428400520-675ef69a3bc4?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=7df813acb5f2c1f7261ea675d078073f&auto=format&fit=crop&w=1267&q=80"

        Glide
                .with(postVH.itemView.getContext())
                .load(model.getImage_profile())
                .into(postVH.image_profile);

        Glide
                .with(postVH.itemView.getContext())
                .load(model.getImage_content())
                .into(postVH.image_post);
    }

    @Override
    public int getItemCount() {
        return PostModel.LIST.size();
    }


    class PostVH extends RecyclerView.ViewHolder {

        // user details
        private TextView text_name;
        private ImageView image_profile;

        // post details
        private TextView text_posted;
        private TextView text_content;
        private ImageView image_post;

        // post function
        private Button button_like;
        private Button button_comment;

        private PostVH(@NonNull View itemView) {
            super(itemView);

            text_name = itemView.findViewById(R.id.post_text_name);
            image_profile = itemView.findViewById(R.id.post_image_profile);

            text_posted = itemView.findViewById(R.id.post_text_posted);
            text_content = itemView.findViewById(R.id.post_text_content);
            image_post = itemView.findViewById(R.id.post_image_content);

            button_like = itemView.findViewById(R.id.post_button_like);
            button_comment = itemView.findViewById(R.id.post_button_comment);
        }
    }
}
