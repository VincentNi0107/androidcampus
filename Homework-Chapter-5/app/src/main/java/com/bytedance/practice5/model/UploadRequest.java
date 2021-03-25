package com.bytedance.practice5.model;

import com.google.gson.annotations.SerializedName;

import okhttp3.MultipartBody;
public class UploadRequest {
    @SerializedName("from")
    String from;
    @SerializedName("to")
    String to;
    @SerializedName("content")
    String content;
    @SerializedName("image")
    MultipartBody.Part image;

    public void setContent(String content) {
        this.content = content;
    }
    public void setFrom(String form) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setImage(MultipartBody.Part image) {
        this.image = image;
    }
}
