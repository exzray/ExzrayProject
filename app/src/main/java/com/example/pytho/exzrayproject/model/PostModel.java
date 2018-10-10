package com.example.pytho.exzrayproject.model;

import java.util.ArrayList;
import java.util.List;

public class PostModel {

    public static final List<PostModel> LIST = new ArrayList<>();

    // user details
    private String text_name;
    private String image_profile;

    // post details
    private String image_content;
    private String text_content;
    private String text_posted;

    public String getText_name() {
        return text_name;
    }

    public void setText_name(String text_name) {
        this.text_name = text_name;
    }

    public String getImage_profile() {
        return image_profile;
    }

    public void setImage_profile(String image_profile) {
        this.image_profile = image_profile;
    }

    public String getImage_content() {
        return image_content;
    }

    public void setImage_content(String image_content) {
        this.image_content = image_content;
    }

    public String getText_content() {
        return text_content;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }

    public String getText_posted() {
        return text_posted;
    }

    public void setText_posted(String text_posted) {
        this.text_posted = text_posted;
    }
}
