package com.example.myapplicationnogo;


public class DataModal {

    // variables for storing our image and type.
    private String type;
    private String imgUrl;

    public DataModal() {
        // empty constructor required for firebase.
    }

    // constructor for our object class.
    public DataModal(String type, String imgUrl) {
        this.type = type;
        this.imgUrl = imgUrl;
    }

    // getter and setter methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}