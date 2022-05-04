package com.NIK.HASH;

public class Document {
    //
    // Primary key
    //
    private int id_;

    //
    // Source
    //
    private String src_;

    Document(int id, String src) {
        id_ = id;
        src_ = src;
    }

    //
    // Display the document source
    //
    public void show() {
        System.out.println(Integer.toString(id_) + " : " + src_);
    }

    public int getId_() {
        return id_;
    }

    public String getSrc_() {
        return src_;
    }
}
