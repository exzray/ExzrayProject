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

        // user details
        Glide
                .with(postVH.itemView.getContext())
                .load(model.getImage_profile())
                .into(postVH.image_profile);
        postVH.text_name.setText(model.getText_name());

        // post details
        Glide
                .with(postVH.itemView.getContext())
                .load(model.getImage_content())
                .into(postVH.image_post);
        postVH.text_posted.setText(model.getText_posted());
        postVH.text_content.setText(model.getText_content());
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
