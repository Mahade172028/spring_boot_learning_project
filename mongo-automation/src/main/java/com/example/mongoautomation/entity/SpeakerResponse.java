package com.example.mongoautomation.entity;

public class SpeakerResponse {
    private String id;
    private String title;
    private String jobTitle;
    private String picturePath;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
}
