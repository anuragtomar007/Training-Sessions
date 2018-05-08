package com.example.anurag.trainingsessions;

/**
 * Created by anurag on 2/3/18.
 */

public class TestClass {
    private String tname;
    private int timage;
    private Boolean aBoolean;

    public TestClass(String tname, int timage, Boolean aBoolean) {
        this.tname = tname;
        this.timage = timage;
        this.aBoolean = aBoolean;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTimage() {
        return timage;
    }

    public void setTimage(int timage) {
        this.timage = timage;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }
}
