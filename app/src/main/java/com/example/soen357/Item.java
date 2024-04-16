package com.example.soen357;

public class Item {
    private String title;
    private int imageResourceId;

    public Item(String title, int imageResourceId) {
        this.title = title;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
