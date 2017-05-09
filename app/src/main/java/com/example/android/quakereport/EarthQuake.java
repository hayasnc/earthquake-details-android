package com.example.android.quakereport;



public class Earthquake {

    private long mDate;

    private String mPlace;

    private String mMagnitude;


    public Earthquake(long vDate, String vPlace, String vMagnitude)
    {
        mDate = vDate;
        mPlace = vPlace;
        mMagnitude = vMagnitude;
    }

    public long getmDate() {
        return mDate;
    }

    public String getmPlace() {
        return mPlace;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }
}