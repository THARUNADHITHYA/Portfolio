package com.example.portfolio.cv;

public class CVItem {
    private String title;
    private String description;

    public CVItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public CVItem() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
