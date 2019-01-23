package com.example.demo_viewpager;

public class Item {
    private String mImageItem;
    private String mNameItem;

    public Item() {
    }

    public Item(String imageItem, String nameItem) {
        this.mImageItem = imageItem;
        this.mNameItem = nameItem;
    }

    public String getmImageItem() {
        return mImageItem;
    }

    public void setmImageItem(String mImageItem) {
        this.mImageItem = mImageItem;
    }

    public String getmNameItem() {
        return mNameItem;
    }

    public void setmNameItem(String mNameItem) {
        this.mNameItem = mNameItem;
    }
}
