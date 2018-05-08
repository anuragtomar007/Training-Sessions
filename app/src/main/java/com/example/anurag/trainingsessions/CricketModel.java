package com.example.anurag.trainingsessions;

public class CricketModel {
    private String Cname;
    private String Tname;
    private String Role;
    private int image;

    public CricketModel(String cname, String tname, String role, int image) {
        this.Cname = cname;
        this.Tname = tname;
        this.Role = role;
        this.image = image;
    }

    public String getCname() {
        return Cname;
    }

    public String getTname() {
        return Tname;
    }

    public String getRole() {
        return Role;
    }

    public int getImage() {
        return image;
    }
}
