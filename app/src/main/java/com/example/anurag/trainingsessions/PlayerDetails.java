package com.example.anurag.trainingsessions;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by anurag on 27/2/18.
 */

public class PlayerDetails implements Parcelable {
    private String pname;
    private String prole;
    private String pcountry;
    private String pipl;

    public PlayerDetails(String pname, String prole, String pcountry, String pipl) {
        this.pname = pname;
        this.prole = prole;
        this.pcountry = pcountry;
        this.pipl = pipl;
    }

    protected PlayerDetails(Parcel in) {
        pname = in.readString();
        prole = in.readString();
        pcountry = in.readString();
        pipl = in.readString();
    }

    public String getPname() {
        return pname;
    }

    public String getProle() {
        return prole;
    }

    public String getPcountry() {
        return pcountry;
    }

    public String getPipl() {
        return pipl;
    }

    public static final Creator<PlayerDetails> CREATOR = new Creator<PlayerDetails>() {
        @Override
        public PlayerDetails createFromParcel(Parcel in) {
            return new PlayerDetails(in);
        }

        @Override
        public PlayerDetails[] newArray(int size) {
            return new PlayerDetails[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(pname);
        dest.writeString(prole);
        dest.writeString(pcountry);
        dest.writeString(pipl);
    }
}
