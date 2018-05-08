package com.example.anurag.trainingsessions;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by anurag on 23/2/18.
 */

public class UserDetails implements Parcelable {
    private String username;
    private String password;

    public UserDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    protected UserDetails(Parcel in) {
        username = in.readString();
        password = in.readString();
    }

    public static final Creator<UserDetails> CREATOR = new Creator<UserDetails>() {
        @Override
        public UserDetails createFromParcel(Parcel in) {
            return new UserDetails(in);
        }

        @Override
        public UserDetails[] newArray(int size) {
            return new UserDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(password);
    }
}
