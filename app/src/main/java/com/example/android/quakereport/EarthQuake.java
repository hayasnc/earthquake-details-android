package com.example.android.quakereport;



public class Earthquake {

    private String mDate;

    private String mPlace;

    private String mMagnitude;


    public Earthquake(String vDate, String vPlace, String vMagnitude)
    {
        mDate = vDate;
        mPlace = vPlace;
        mMagnitude = vMagnitude;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmPlace() {
        return mPlace;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }
}